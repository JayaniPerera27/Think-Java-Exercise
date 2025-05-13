package Exercises_9;

import java.math.BigInteger;

public class BigPow {
    public static BigInteger pow(int x, int n) {
        if (n == 0) return BigInteger.ONE;

        BigInteger t = pow(x, n / 2);

        if (n % 2 == 0) {
            return t.multiply(t);
        }

        else {
            return t.multiply(t).multiply(BigInteger.valueOf(x));
        }
    }

    public static void main(String[] args) {

        System.out.println("2^10 = " + pow(2, 10));
        System.out.println("2^20 = " + pow(2, 20));
        System.out.println("2^30 = " + pow(2, 30));
        System.out.println("2^50 = " + pow(2, 50));
        System.out.println("2^100 = " + pow(2, 100));


//        System.out.println("\nLarge results:");
//        System.out.println("5^100 = " + pow(5, 100));
//        System.out.println("10^50 = " + pow(10, 50));
    }
}