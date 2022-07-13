package ru.ivanov.chainofresponsibility.app.service;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TestingDepartment {
  public void testProduct(String productId, String orderId) {
    log.info("Тестируем продукт с id " + productId + " из заказа " + orderId);
  }
}
