package com.example.calculator.exeptions;

public class IllegalNumberExeption extends Exception {
    public IllegalNumberExeption() {
    }

    public IllegalNumberExeption(String message) {
        super(message);
    }
}
