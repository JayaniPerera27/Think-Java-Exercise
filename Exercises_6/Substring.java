package Exercises_6;

public class Substring {
    public static void main(String[] args){
        String fruit = "banana";

        char letter = fruit.charAt(0);
        System.out.println(letter);

        int index = fruit.indexOf ("nan");
        System.out.println(index);

        String name = fruit.substring (0,2);
        System.out.println(name);

        String name2 =  fruit.substring(2, fruit.length()- 1);
        System.out.println(name2);

    }
}
