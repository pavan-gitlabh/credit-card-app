package com.creditcard.command;

import java.math.BigDecimal;

public class AddCreditCardCommand {
	private String id;
	private String name;
	private String cardNumber;
	private BigDecimal creditLimit;

	public AddCreditCardCommand() {
	}

	public AddCreditCardCommand(String id, String name, String cardNumber, BigDecimal creditLimit) {
		this.id = id;
		this.name = name;
		this.cardNumber = cardNumber;
		this.creditLimit = creditLimit;
	}

	// Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "AddCreditCardCommand{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", cardNumber='" + cardNumber
				+ '\'' + ", creditLimit=" + creditLimit + '}';
	}
}