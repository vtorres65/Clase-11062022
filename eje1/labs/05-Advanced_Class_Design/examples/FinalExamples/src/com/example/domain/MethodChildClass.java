package com.example.domain;

public class MethodChildClass extends MethodParentClass {    
    // compile time error
    public void printMessage() {
        System.out.println("Cannot override method");
    }
}