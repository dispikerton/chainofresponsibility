package ru.ivanov.chainofresponsibility.app.option;

import org.springframework.stereotype.Component;

import ru.ivanov.chainofresponsibility.app.model.Order;
import ru.ivanov.chainofresponsibility.app.service.PackagingDepartment;
import ru.ivanov.chainofresponsibility.app.model.Product;

@Component
public class FestivePackagingOption implements AdditionalOption {
  private final PackagingDepartment packagingDepartment;

  public FestivePackagingOption(PackagingDepartment packagingDepartment) {
    this.packagingDepartment = packagingDepartment;
  }

  @Override
  public void apply(Order order) {
    order.getProducts()
      .stream()
      .filter(Product::isFestivePackaging)
      .forEach(product -> packagingDepartment.festivelyPack(product.getId(), order.getId()));
  }
}
