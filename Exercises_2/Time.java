package Exercises_2;

public class Time {
    public static void main(String[] args){
        int hour = 14;
        int minute = 30;
        int second = 45;

        int secondsSinceMidnight = (hour * 60 * 60 )+ (minute * 60) + second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);

        // Calculate seconds remaining in the day
        int secondsInDay = 24 * 60 * 60;
        int secondsRemaining = secondsInDay - secondsSinceMidnight;
        System.out.println("Seconds remaining in the day: " + secondsRemaining);

        // Calculate percentage of day passed
        double percentage = (double) secondsSinceMidnight / secondsInDay * 100;
        System.out.println("Percentage of day that has passed: " + percentage + "%");




    }
}
