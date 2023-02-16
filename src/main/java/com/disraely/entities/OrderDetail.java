package com.disraely.entities;

import java.util.List;

public class OrderDetail extends BaseEntity {
    private Double quantity;
    private Double price;
    private Chef chef;
    private Order order;
    private Product product;
    private List<OrderDetailTax> orderDetailTaxList;

    public OrderDetail() {
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<OrderDetailTax> getOrderDetailTaxList() {
        return orderDetailTaxList;
    }

    public void setOrderDetailTaxList(List<OrderDetailTax> orderDetailTaxList) {
        this.orderDetailTaxList = orderDetailTaxList;
    }
}
