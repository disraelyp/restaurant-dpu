package com.disraely.entities;

import com.disraely.enums.OrderStatus;
import java.util.List;

public class Order extends BaseEntity {
  private Double total;
  private OrderStatus orderStatus;
  private Client client;
  private Cashier cashier;
  private Waiter waiter;
  private List<OrderDetail> orderDetailList;

  public Order() {
  }

  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public OrderStatus getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(OrderStatus orderStatus) {
    this.orderStatus = orderStatus;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public Cashier getCashier() {
    return cashier;
  }

  public void setCashier(Cashier cashier) {
    this.cashier = cashier;
  }

  public Waiter getWaiter() {
    return waiter;
  }

  public void setWaiter(Waiter waiter) {
    this.waiter = waiter;
  }

  public List<OrderDetail> getOrderDetailList() {
    return orderDetailList;
  }

  public void setOrderDetailList(List<OrderDetail> orderDetailList) {
    this.orderDetailList = orderDetailList;
  }
}
