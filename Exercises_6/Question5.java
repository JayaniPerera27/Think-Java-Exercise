package Exercises_6;

import java.util.Scanner;

public class Question5 {
    public static boolean isAbecedarian(String word) {

        if (word.length() <= 1) {
            return true;
        }

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) < word.charAt(i-1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word : ");
        String word = in.nextLine();

        boolean result = isAbecedarian(word);

        if (result) {
            System.out.println("\"" + word + "\" is an abecedarian word.");
        } else {
            System.out.println("\"" + word + "\" is not an abecedarian word.");
        }

    }
}
