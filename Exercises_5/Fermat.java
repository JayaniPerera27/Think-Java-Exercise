package Exercises_5;

import java.util.Scanner;

public class Fermat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get input values
        System.out.print("Enter number a: ");
        int a = in.nextInt();

        System.out.print("Enter number b: ");
        int b = in.nextInt();

        System.out.print("Enter number c: ");
        int c = in.nextInt();

        System.out.print("Enter number n: ");
        int n = in.nextInt();


        checkFermat(a, b, c, n);
    }

    public static void checkFermat(int a, int b, int c, int n) {
        if (n > 2) {

            double aPow = Math.pow(a, n);
            double bPow = Math.pow(b, n);
            double cPow = Math.pow(c, n);


            if (aPow + bPow == cPow) {
                System.out.println("Holy smokes, Fermat was wrong!");
            } else {
                System.out.println("No, that doesn't work.");
            }
        } else {
            System.out.println("No, that doesn't work.");
        }
    }


}
