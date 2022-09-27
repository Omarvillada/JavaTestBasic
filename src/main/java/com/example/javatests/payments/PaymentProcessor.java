package com.example.javatests.payments;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount){
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));
        if (response.getStatus() == PaymentStatus.OK){
            return true;
        }else {
            return false;
        }

    }
}
