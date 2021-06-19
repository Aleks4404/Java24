package com.java24hours;

public class PlanetWeight {
    public static void main(String[] argument) {
        System.out.print("Ваш вес на Земле будет ");
        double weight = 80;
        System.out.println(weight);

        System.out.print("Ваш вес на Меркурии будет ");
        double mercury = weight * .378;
        System.out.println(mercury);

        System.out.print("Ваш вес на Луне будет ");
        double moon = weight * .166;
        System.out.println(moon);

        System.out.print("Ваш вес на Юпитере будет ");
        double jupiter = weight * 2.3644;
        System.out.println(jupiter);

        System.out.print("Ваш вес на Венере будет ");
        double veneers = weight * .907;
        System.out.println(veneers);

        System.out.print("Ваш вес на Уране будет ");
        double uranes = weight * .889;
        System.out.println(uranes);
    }
}