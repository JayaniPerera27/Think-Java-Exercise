package Exercises_8;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args){
        int a = fibonacci(6);
        System.out.println(a);
    }
}
