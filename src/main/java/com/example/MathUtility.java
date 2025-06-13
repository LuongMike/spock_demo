package com.example;

public class MathUtility {
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 và 1 không phải là số nguyên tố
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Nếu chia hết cho số i thì không phải là số nguyên tố
            }
        }
        return true;
    }
}
