package com.creditcard.query.processor;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.creditcard.event.CreditCardAddedEvent;
import com.creditcard.query.model.CreditCardView;

@Component
public class CreditCardQueryProcessor {

	private final RedisTemplate<String, CreditCardView> redisTemplate;

	@Autowired
	public CreditCardQueryProcessor(RedisTemplate<String, CreditCardView> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	@KafkaListener(topics = "card-events")
	public void process(CreditCardAddedEvent event) {

		CreditCardView view = new CreditCardView(event.getId(), event.getName(), event.getCardNumber(),
				new BigDecimal(0.0),

				event.getCreditLimit());

		redisTemplate.opsForValue().set("cards:" + event.getId(), view);
	}
}
