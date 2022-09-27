package com.example.javatests.payments;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    @Test
    public void payment_is_correct(){

        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentStatus.OK));
        PaymentProcessor processor = new PaymentProcessor(paymentGateway);
        assertTrue(processor.makePayment(10000));
    }

    @Test
    public void payment_is_wrong(){

        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentStatus.ERROR));
        PaymentProcessor processor = new PaymentProcessor(paymentGateway);
        assertFalse(processor.makePayment(10000));
    }
}