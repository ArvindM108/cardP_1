package com.cardpayment;
public class PaymentProcessor {

    //Composition
    private ICardPayment cardPayment;

    public void setCardPayment(ICardPayment cardPayment){
        this.cardPayment=cardPayment;
    }

    // no need to take cardType, bcoz of setCardType
    //    public boolean doPayment(String cardType, Double billAmt){
    public boolean  doPayment(Double billAmt){

//        if ("CREDIT_CARD".equals(cardType)){
//            return cardPayment.payBill(billAmt);
//        } else if ("DEBIT_CARD".equals(cardType)) {
//            return cardPayment.payBill(billAmt);
//        } else if ("ZETA".equals(cardType)) {
//            return cardPayment.payBill(billAmt);
//        }

//        else {
//            return false;
//        }
        return cardPayment.payBill(billAmt);
    }
}