package ru.ivanov.chainofresponsibility.app.option;

import org.springframework.stereotype.Component;

import ru.ivanov.chainofresponsibility.app.model.Order;
import ru.ivanov.chainofresponsibility.app.model.Product;
import ru.ivanov.chainofresponsibility.app.service.TestingDepartment;

@Component
public class TestingOption implements AdditionalOption {
  private final TestingDepartment testingDepartment;

  public TestingOption(TestingDepartment testingDepartment) {
    this.testingDepartment = testingDepartment;
  }

  @Override
  public void apply(Order order) {
    order.getProducts()
      .stream()
      .filter(Product::isTesting)
      .forEach(product -> testingDepartment.testProduct(product.getId(), order.getId()));
  }
}
