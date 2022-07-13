package ru.ivanov.chainofresponsibility.app.service;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SmsNotificator {
  public void enableNotifications(String orderId, String phoneNumber) {
    log.info("Включены смс уведомления для заказа номер " + orderId + " по телефону " + phoneNumber);
  }
}
