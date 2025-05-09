package com.creditcard.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class CreditCard {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String cardNumber;
	private BigDecimal balance = BigDecimal.ZERO;
	private BigDecimal cardLimit;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public BigDecimal getCardLimit() {
		return cardLimit;
	}

	public void setCardLimit(BigDecimal cardLimit) {
		this.cardLimit = cardLimit;
	}

	// Getters and Setters
}
