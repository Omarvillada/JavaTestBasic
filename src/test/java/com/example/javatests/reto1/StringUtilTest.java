package com.example.javatests.reto1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void test_string_is_not_empty(){
        assertFalse(StringUtil.isEmpty("Omar"));
    }
    @Test
    public void empty_quotes_is_string_empty(){
        assertTrue(StringUtil.isEmpty(""));
    }
    @Test
    public void string_null_is_empty(){
        assertTrue(StringUtil.isEmpty(null));
    }
    @Test
    public void string_spaces_is_string_empty(){
        assertTrue(StringUtil.isEmpty(" "));
    }
}