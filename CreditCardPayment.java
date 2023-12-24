package com.cardpayment;

public class CreditCardPayment implements ICardPayment {
    public boolean payBill(Double billAmt){
        System.out.println("Paying Bill Amount Using CCD: "+ billAmt);
        //Logic to check Bal availability

        return true;
    }
}

