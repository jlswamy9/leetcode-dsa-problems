package com.designpatterns.strategy;

public class Shopping {
    public static void main(String args[]){
        ShoppingCart shoppingCart = new ShoppingCart();
       // shoppingCart.makePayment(new PayPalPaymentStrategy("jlswamy","password"),1000);
        shoppingCart.makePayment(new CardPaymentStrategy("jlswamy","123456","04/29","123"),1000);
    }
}
