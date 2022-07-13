package ru.ivanov.chainofresponsibility.app.option;

import org.springframework.stereotype.Component;

import ru.ivanov.chainofresponsibility.app.service.Insurance;
import ru.ivanov.chainofresponsibility.app.model.Order;
import ru.ivanov.chainofresponsibility.app.model.Product;

@Component
public class InsuranceOption implements AdditionalOption {
  private final Insurance insurance;

  public InsuranceOption(Insurance insurance) {
    this.insurance = insurance;
  }

  @Override
  public void apply(Order order) {
    order.getProducts()
      .stream()
      .filter(Product::isInsurance)
      .forEach(product -> insurance.insure(product.getId(), order.getId()));
  }
}
