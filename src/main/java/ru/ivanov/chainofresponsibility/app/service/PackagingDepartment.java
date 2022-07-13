package ru.ivanov.chainofresponsibility.app.service;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PackagingDepartment {
  public void festivelyPack(String productId, String orderId) {
    log.info("Празднично упаковываем продукт с id " + productId + " из заказа " + orderId);
  }
}
