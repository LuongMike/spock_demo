package com.example;

public class Factorial {
    public static long calculate(int n) {
        if (n < 0 || n > 20){
            throw new IllegalArgumentException("n must be between 0 and 20");
        }
        if (n == 0){
            return 1;
        }
        long result = 1 ;
        for (int i = 1; i <= n ; i++) {
            result *= i;
        }
        return result;
    }
}
