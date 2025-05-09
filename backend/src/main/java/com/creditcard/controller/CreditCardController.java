package com.creditcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.creditcard.dto.CreditCardDto;
import com.creditcard.model.CreditCard;
import com.creditcard.service.CreditCardService;
import com.creditcard.util.LuhnValidator;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
public class CreditCardController {

    @Autowired
    private CreditCardService cardService;

    @PostMapping
    public ResponseEntity<?> addCard(@RequestBody CreditCardDto request) {
        if (!LuhnValidator.isValid(request.getCardNumber())) {
            return ResponseEntity.badRequest().body("Invalid card number.");
        }
        return ResponseEntity.ok(cardService.createCard(request));
    }

    @GetMapping
    public List<CreditCard> getAllCards() {
        return cardService.getAllCards();
    }
}
