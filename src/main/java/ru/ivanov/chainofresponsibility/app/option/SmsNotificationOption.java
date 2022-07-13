package ru.ivanov.chainofresponsibility.app.option;

import org.springframework.stereotype.Component;

import ru.ivanov.chainofresponsibility.app.model.Order;
import ru.ivanov.chainofresponsibility.app.service.SmsNotificator;

@Component
public class SmsNotificationOption implements AdditionalOption {

  private final SmsNotificator smsNotificator;

  public SmsNotificationOption(SmsNotificator smsNotificator) {
    this.smsNotificator = smsNotificator;
  }

  @Override
  public void apply(Order order) {
    if (order.isSmsNotification()){
      smsNotificator.enableNotifications(order.getId(), order.getPhoneNumber());
    }
  }
}
