package Exercises_2;

public class Date {
    public static void main(String[] args){
        String day , month;
        int date , year;

        day = "Tuesday";
        date = 6;
        month = "May";
        year = 2025;

        System.out.println(day);
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);

        System.out.println("American format: " + day + "," +month + " " + date + "," + year);

        System.out.println("European format: " + day + " " + date + " " + month + " " + year);


    }
}
