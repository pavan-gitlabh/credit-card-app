package com.creditcard.query.model;

import java.math.BigDecimal;

public class CreditCardView {
	private String id;
	private String name;
	private String cardNumber;
	private BigDecimal balance;
	private BigDecimal creditLimit;

	public CreditCardView() {
	}

	public CreditCardView(String id, String name, String cardNumber, BigDecimal balance, BigDecimal creditLimit) {
		this.id = id;
		this.name = name;
		this.cardNumber = cardNumber;
		this.balance = balance;
		this.creditLimit = creditLimit;
	}

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

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	@Override
	public String toString() {
		return "CreditCardView{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", cardNumber='" + cardNumber + '\''
				+ ", balance=" + balance + ", creditLimit=" + creditLimit + '}';
	}
}
