package Exercises_8;

public class Factorial {

    /*public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int recurse = factorial(n- 1);
        int result = n * recurse;
        return result;

    }*/

    //Leap of Faith to Factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args){
        int a = factorial(5);
        System.out.println(a);

    }
}
