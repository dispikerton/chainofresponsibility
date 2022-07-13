package ru.ivanov.chainofresponsibility.app.option;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import ru.ivanov.chainofresponsibility.app.model.Order;
import ru.ivanov.chainofresponsibility.app.model.Product;

@Component
@Slf4j
public class InstallationOption implements AdditionalOption {
  @Override
  public void apply(Order order) {
    order.getProducts()
      .stream()
      .filter(Product::isInstallation)
      .forEach(product -> log.info("Установка бытовой техники под id " + product.getId()));
  }
}
