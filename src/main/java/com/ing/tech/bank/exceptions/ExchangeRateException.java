package com.ing.tech.bank.exceptions;

public class ExchangeRateException extends RuntimeException{
    public ExchangeRateException(String message) {
        super(message);
    }
}