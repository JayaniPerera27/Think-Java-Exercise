package Exercises_8;

public class Recursive {
    public static void main(String[] args){
        countdown(8);
        forever("abc");

    }
    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n- 1);
        }
    }

    //without base case
    public static void forever(String s) {
        System.out.println(s);
        forever(s);
    }
}
