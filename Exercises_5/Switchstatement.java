package Exercises_5;

import java.util.Scanner;

public class Switchstatement {

    public static int getX (){
        Scanner in = new Scanner (System.in);

        System.out.print ("Enter number between 0 and 4: ");
        int x = in.nextInt();
        return x;
    }

    public static void checkInt (){
        int x = getX();
        String word;

        switch (x){
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            default:
                word = "unknown";
                break;
        }
        System.out.println(word);
    }

    public static void main (String[] args){

        checkInt();
    }

}
