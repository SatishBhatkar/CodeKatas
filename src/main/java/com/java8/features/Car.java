package com.java8.features;

public class Car implements Vehicle {

    public Car(String bmw) {
    }

    @Override
    public String getBrand() {
        return "Brand  ";
    }

    @Override
    public String speedUp() {
        return "The car is speeding up";
    }

    @Override
    public String speedDown() {
        return "SThe car is slowing down";
    }
}
