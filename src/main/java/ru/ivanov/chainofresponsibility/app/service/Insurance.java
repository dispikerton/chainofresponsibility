package ru.ivanov.chainofresponsibility.app.service;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Insurance {
  public void insure(String productId, String orderId) {
    log.info("Страхуем продукт с id " + productId + " из заказа " + orderId);
  }
}
