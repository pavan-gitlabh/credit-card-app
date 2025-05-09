package com.creditcard.event;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

// TODO Change it to Record
public class CreditCardAddedEvent implements Serializable {
	private String id;
	private String name;
	private String cardNumber;
	private BigDecimal creditLimit;
	private Instant timestamp;

	public CreditCardAddedEvent(String id, String name, String cardNumber, BigDecimal creditLimit) {
		this.id = id;
		this.name = name;
		this.cardNumber = cardNumber;
		this.creditLimit = creditLimit;
		this.timestamp = Instant.now();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}