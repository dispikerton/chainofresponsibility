package ru.ivanov.chainofresponsibility.app;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ru.ivanov.chainofresponsibility.app.model.Order;
import ru.ivanov.chainofresponsibility.app.service.OrderService;

@RestController
public class MDoradoController {
  private final OrderService orderService;

  public MDoradoController(OrderService orderService) {
    this.orderService = orderService;
  }

  @PostMapping
  public boolean createOrder(@RequestBody Order order){
    return orderService.createOrder(order);
  }
}
