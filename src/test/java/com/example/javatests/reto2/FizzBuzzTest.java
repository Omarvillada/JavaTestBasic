package com.example.javatests.reto2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void if_the_number_is_divisible_for_three(){
        assertEquals(FizzBuzz.fizzBuzz(3),"Fizz");
    }

    @Test
    public void if_the_number_is_divisible_for_five(){
        assertEquals(FizzBuzz.fizzBuzz(25),"Buzz");
    }

    @Test
    public void if_the_number_is_divisible_for_five_and_three(){
        assertEquals(FizzBuzz.fizzBuzz(30),"FizzBuzz");
    }


}