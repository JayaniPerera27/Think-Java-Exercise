package Exercises_5;

import java.util.Scanner;

public class Ifcondition {
    public static void main(String[] args){
        checkInt();
    }

    public static int getX (){
        Scanner in = new Scanner (System.in);

        System.out.print ("Enter any int number: ");
        int x = in.nextInt();
        return x;
    }

    public static void checkInt ( ){
        int x = getX();

        if ( x > 0) {
            System.out.println("positive");

        } else if(x<0) {
            System.out.println("Negative");
        } else {
            System.out.println("x is zero");
        }

//        if (x>0)
//            System.out.println("positive");
//            System.out.println("hi");
    }
}
