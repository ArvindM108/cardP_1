package com.cardpayment;

public class DebitCardPayment implements ICardPayment {

    public boolean payBill(Double billAmt) {
        System.out.println("Paying Bill Amount Using DCD: " + billAmt);
        //Logic to check Bal availability
        return true;
    }
}
