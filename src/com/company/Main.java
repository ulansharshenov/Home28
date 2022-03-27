package com.company;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        UnaryOperator<Double> unaryOperator = sqrt();
        System.out.println(unaryOperator.apply(16.0));
    }

    public static UnaryOperator<Double> sqrt(){
        return (a) -> Math.sqrt(a);
    }
}
