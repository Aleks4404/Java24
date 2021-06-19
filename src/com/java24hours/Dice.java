package com.java24hours;

import  java.util.*;

public class Dice {
    public static void main(String[] argument) {
        Random generator = new Random();
        int value = generator.nextInt();
        System.out.println("Случайное число: "
        + value);
    }
}