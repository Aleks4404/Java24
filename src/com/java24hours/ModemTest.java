package com.java24hours;

class ModemTest {
    public static void main( String [] arguments) {
        CableModem surfBoard = new CableModem();
        DslModem gateway = new DslModem();
        surfBoard.speed = 500_000;
        gateway.speed = 400_000;
        System.out.println("Попытка подключения кабельного модема:");
        surfBoard.displaySpeed();
        surfBoard.connect();
        System.out.println("Попытка подключения DSL-модема:");
        gateway.displaySpeed();
        gateway.connect();
    }
}