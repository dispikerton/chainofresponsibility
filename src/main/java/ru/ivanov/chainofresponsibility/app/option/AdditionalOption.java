package ru.ivanov.chainofresponsibility.app.option;

import ru.ivanov.chainofresponsibility.app.model.Order;

public interface AdditionalOption {
  void apply(Order order);
}
