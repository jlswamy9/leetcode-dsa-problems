package com.designpatterns.strategy;

public class CardPaymentStrategy implements PaymentStrategy{
    private String name;
    private String cNum;
    private String expiryDate;
    private  String cvv;

    public CardPaymentStrategy(String name,String cNum,String expiryDate,String cvv){
        this.cNum = cNum;
        this.name = name;
        this.expiryDate = expiryDate;
        this.cvv =cvv;
    }
    public void pay(int amount){
        System.out.printf("Paid %d thru card payment",amount);
    }
}
