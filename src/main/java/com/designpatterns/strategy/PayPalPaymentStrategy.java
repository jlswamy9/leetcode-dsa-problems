package com.designpatterns.strategy;

public class PayPalPaymentStrategy implements PaymentStrategy{
    private String email;
    private String password;

    public PayPalPaymentStrategy(String email,String password){
        this.email = email;
        this.password = password;
    }

    public void pay(int amount){
        System.out.printf("Amount %d paid via paypal",amount);
    }
}
