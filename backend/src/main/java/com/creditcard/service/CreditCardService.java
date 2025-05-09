package com.creditcard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creditcard.dto.CreditCardDto;
import com.creditcard.model.CreditCard;
import com.creditcard.repository.CreditCardRepository;

import java.util.List;

@Service
public class CreditCardService {

	@Autowired
	private CreditCardRepository repository;

	public CreditCard createCard(CreditCardDto req) {
		CreditCard card = new CreditCard();
		card.setName(req.getName());
		card.setCardNumber(req.getCardNumber());
		card.setCardLimit(req.getCardLimit());
		return repository.save(card);
	}

	public List<CreditCard> getAllCards() {
		return repository.findAll();
	}
}
