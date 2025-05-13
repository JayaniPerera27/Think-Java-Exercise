package Exercises_9;

public class Test {
    public static void main(String[] args) {

        System.out.println("String + String: " + "hello" + " world");
        System.out.println("String + char: " + "hello" + 'A');
        System.out.println("String + int: " + "count: " + 5);
        System.out.println("String + double: " + "price: " + 9.99);
        System.out.println("String + boolean: " + "active: " + true);


        System.out.println("char + char: " + ('A' + 'B'));
        System.out.println("char + int: " + ('A' + 1));
        System.out.println("char + double: " + ('A' + 0.5));


        System.out.println("int + int: " + (5 + 3));
        System.out.println("int + double: " + (5 + 3.14));
        System.out.println("double + double: " + (2.5 + 3.5));


//         System.out.println("boolean + boolean: " + (true + false));
//         System.out.println("boolean + int: " + (true + 1));
//         System.out.println("boolean + char: " + (true + 'A'));


        System.out.println("Empty string + int: " + "" + 5);
        System.out.println("Empty string + char: " + "" + 'A');
        System.out.println("Empty string + boolean: " + "" + true);
    }
}
