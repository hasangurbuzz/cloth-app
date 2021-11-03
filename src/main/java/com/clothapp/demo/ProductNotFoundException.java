package com.clothapp.demo;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
