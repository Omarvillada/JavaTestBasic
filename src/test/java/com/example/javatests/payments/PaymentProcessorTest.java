package com.example.javatests.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;
    @Before
    public void setup(){
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void payment_is_correct(){

        //Preparacion del escenario
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentStatus.OK));
        PaymentProcessor processor = new PaymentProcessor(paymentGateway);

        //Ejecucion del metodo
        boolean result = processor.makePayment(10000);

        //COMPROBACION
        assertTrue(result);
    }

    @Test
    public void payment_is_wrong(){
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentStatus.ERROR));
        PaymentProcessor processor = new PaymentProcessor(paymentGateway);
        assertFalse(processor.makePayment(10000));
    }
}