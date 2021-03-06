package com.java24hours;

import java.util.Arrays;

public class NameSorter {
    public static void main(String[] arguments) {
        String names[] = {"Иван", "Семен", "Дмитрий", "Наталья",
        "Ольга", "Валентина", "Татьяна", "Андрей", "Борис", "Юля",
                "Марина", "Шура", "Эврика", "Людмила", "Галина", "Жанна", "Елена"};
        System.out.println("До сортировки: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }
        System.out.println();
        Arrays.sort(names);
        System.out.println("После сортировки: ");
        for (int i =  0; i < names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }
        System.out.println();
    }
}