package com.creditcard.command.handler;

import org.axonframework.commandhandling.CommandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.creditcard.command.AddCreditCardCommand;
import com.creditcard.event.CreditCardAddedEvent;
import com.creditcard.validation.Luhn10Validator;

@Component
public class AddCreditCardCommandHandler {
	private final KafkaTemplate<String, Object> kafkaTemplate;

	@Autowired
	public AddCreditCardCommandHandler(KafkaTemplate<String, Object> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	@CommandHandler
	public void handle(AddCreditCardCommand command) {
		if (!Luhn10Validator.isValid(command.getCardNumber())) {
			throw new IllegalArgumentException("Invalid card number");
		}

		CreditCardAddedEvent event = new CreditCardAddedEvent(command.getId(), command.getName(),
				command.getCardNumber(), command.getCreditLimit());
		kafkaTemplate.send("card-events", event);
	}
}
