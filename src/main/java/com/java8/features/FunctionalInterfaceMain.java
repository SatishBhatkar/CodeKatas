package com.java8.features;

public class FunctionalInterfaceMain {
    public static void main(String[] args) {
        int a=5;
        FunctionalSequareInterface sequare=(int x)->x*x;
        int seq=sequare.calculate(a);
        System.out.println(seq);
    }
}
