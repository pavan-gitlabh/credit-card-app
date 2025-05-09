/*
 * package com.creditcard.query.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.data.redis.core.RedisTemplate; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.creditcard.query.model.CreditCardView;
 * 
 * @RestController
 * 
 * @RequestMapping("/api/cards") public class CreditCardQueryController {
 * private final RedisTemplate<String, CreditCardView> redisTemplate;
 * 
 * @Autowired public CardQueryController(RedisTemplate<String, CardView>
 * redisTemplate) { this.redisTemplate = redisTemplate; }
 * 
 * @GetMapping public List<CardView> getAllCards() { return
 * redisTemplate.opsForValue().multiGet(redisTemplate.keys("card:*")); } }
 */