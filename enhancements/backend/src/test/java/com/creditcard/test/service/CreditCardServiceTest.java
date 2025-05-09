/*package com.creditcard.test.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import javax.smartcardio.Card;

import org.junit.jupiter.api.Test;

import com.creditcard.model.CreditCard;
import com.creditcard.service.CreditCardService;

public class CreditCardServiceTest {

	private CreditCardService creditCardService;

	@Test
	void addCard_ValidCard_ShouldAddSuccessfully() {
		CreditCard card = new CreditCard("Test 1", "4539578763621486", 1000);

		CreditCard savedCard = creditCardService.addCreditCard(card);

		assertNotNull(savedCard);
		assertEquals("Test1", savedCard.getName());
		assertEquals(0, savedCard.getBalance());
	}

	@Test
	void addCard_InvalidCardNumber_ShouldThrowException() {
		CreditCard card = new CreditCard("TEst 2", "1234567890123456", 500);

		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			creditCardService.addCreditCard(card);
		});

		assertEquals("Invalid credit card number", exception.getMessage());
	}

	@Test
	void getAllCards_ShouldReturnAllCards() {
		creditCardService.addCreditCard(new CreditCard("TEst1 ", "4539578763621486", 1000));
		creditCardService.addCreditCard(new CreditCard("Bob", "4485275742308327", 1500));

		List<CreditCard> allCards = creditCardService.getAllCards();

		assertEquals(2, allCards.size());
	}
}
*/
