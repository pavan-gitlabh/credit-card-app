package com.creditcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.creditcard.model.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}
