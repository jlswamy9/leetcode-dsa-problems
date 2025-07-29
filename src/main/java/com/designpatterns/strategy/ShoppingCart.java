package com.designpatterns.strategy;

public class ShoppingCart {
    public void makePayment(PaymentStrategy paymentStrategy,int totalAmount){
        paymentStrategy.pay(totalAmount);
    }
}
