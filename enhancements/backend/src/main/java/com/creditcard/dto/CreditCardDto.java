package com.creditcard.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.*;

public class CreditCardDto {
	@NotBlank
	private Long id;
	@NotBlank
    private String name;

    @Pattern(regexp = "\\d{1,19}", message = "Card number must be numeric and up to 19 digits")
    private String cardNumber;

    @NotNull
    @DecimalMin("0.0")
    private BigDecimal cardLimit;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }
    public BigDecimal getCardLimit() { return cardLimit; }
    public void setCardLimit(BigDecimal limit) { this.cardLimit = limit; }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
