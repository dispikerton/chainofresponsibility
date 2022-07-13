package ru.ivanov.chainofresponsibility.app;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import ru.ivanov.chainofresponsibility.app.model.Order;

@Component
@Slf4j
public class OrderDao {
  public void saveOrder(Order order){
    log.info("Заказ сохранен " + order);
  }
}
