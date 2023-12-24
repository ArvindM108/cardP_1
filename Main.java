package com.cardpayment;
// Ashok it class-9
public class Main {
    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        //injecting dependent obj into target obj using setter method
        processor.setCardPayment(new CreditCardPayment());

        boolean paymentStatus = processor.doPayment(1560.00);
        if (paymentStatus) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }
    }
}
