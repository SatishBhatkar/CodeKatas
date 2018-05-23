package com.java8.features;

public class DefaultMethod {
    public static void main(String[] args) {
        Vehicle car= new Car("BMW");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.speedDown());
        System.out.println(car.turnAlaramOn());
        System.out.println(car.turnAlarmOff());

    }
}
