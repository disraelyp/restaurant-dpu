package com.disraely.entities;

public class OrderDetailTax extends BaseEntity {
    private OrderDetail orderDetail;
    private Tax tax;

    public OrderDetailTax() {
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public Tax getTax() {
        return tax;
    }
}
