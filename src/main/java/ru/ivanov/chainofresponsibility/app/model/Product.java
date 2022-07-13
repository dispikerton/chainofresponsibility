package ru.ivanov.chainofresponsibility.app.model;

import lombok.Getter;

@Getter
public class Product {
  private final String id;
  private final String name;
  private final boolean insurance;
  private final boolean testing;
  private final boolean festivePackaging;
  private final boolean installation;

  public Product(String id, String name, boolean insurance, boolean testing, boolean festivePackaging, boolean installation) {
    this.id = id;
    this.name = name;
    this.insurance = insurance;
    this.testing = testing;
    this.festivePackaging = festivePackaging;
    this.installation = installation;
  }
}
