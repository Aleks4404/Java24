package com.java24hours;

public class Commodity {
    public static void main(String[] arguments) {
        String command = "Покупка"; // Команда
        int balance = 550; // Баланс
        int quantity = 42;// Количество

        switch (command) {
            case "Покупка":
                quantity += 5;
                balance -= 20;
                break;
            case "Продажа":
                quantity -= 5;
                balance += 15;
        }
        System.out.println("Баланс: $" + balance + "\n" + "Количество: " + quantity);

    }

    String gender = "Womane"; {
        System.out.println((gender.equals("Womane")) ? "Госпажа" : "Госпадин" );
    }
}

