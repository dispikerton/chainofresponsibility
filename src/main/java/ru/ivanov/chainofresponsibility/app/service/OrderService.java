package ru.ivanov.chainofresponsibility.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ru.ivanov.chainofresponsibility.app.OrderDao;
import ru.ivanov.chainofresponsibility.app.model.Order;
import ru.ivanov.chainofresponsibility.app.option.AdditionalOption;

@Service
public class OrderService {
  private final OrderDao orderDao;
  private final List<AdditionalOption> additionalOptions;

  public OrderService(OrderDao orderDao, List<AdditionalOption> additionalOptions) {
    this.orderDao = orderDao;
    this.additionalOptions = additionalOptions;
  }

  public boolean createOrder(Order order) {
    orderDao.saveOrder(order);
    additionalOptions.forEach(additionalOption -> additionalOption.apply(order));
    return true;
  }
}
