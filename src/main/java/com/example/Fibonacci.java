package com.example;

public class Fibonacci {
    public static long calculate(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative number not allowed");
        if (n == 0) return 0;
        if (n == 1) return 1;

        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
