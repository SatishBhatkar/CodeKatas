package com.java8.features;

public interface Vehicle {
    String getBrand();
    String speedUp();
    String speedDown();

    default String turnAlaramOn(){

        return "Turning the vehicle alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }

}
