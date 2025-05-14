package Exercises_8;

public class CountDown {

//    public static void countdown(int n) {
//        if (n == 0) {
//            System.out.println("Blastoff!");
//        } else {
//            System.out.println(n);     // Prints BEFORE recursive call
//            countdown(n - 1);
//        }
//    }

    public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);           // Recursive call happens FIRST
            System.out.println(n);    // Prints AFTER recursive call returns
        }
    }

    public static void main(String[] args){
       // countdown(3);
        countup(3);
    }
}
