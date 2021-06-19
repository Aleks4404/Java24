package com.java24hours;

public class Benchmark {
    public static void main(String[] arguments) {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 60_000;
        long index = 0;
        while (true) {
            double x = Math.sqrt(index);
            long now = System.currentTimeMillis();
            if (now > endTime) {
                break;
            }
            index++;
        }
        System.out.println(index + " циклов за одну минуту.");
    }
}