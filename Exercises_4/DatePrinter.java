package Exercises_4;

public class DatePrinter {

    public static void printAmerican(String day, String month, int date, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }
    public static void printEuropean(String day, String month, int date, int year) {
        System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {
        printAmerican("Monday", "July", 22, 2019);
        printEuropean("Monday", "July", 22, 2019);
    }



}
