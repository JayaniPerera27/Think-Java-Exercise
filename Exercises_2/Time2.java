package Exercises_2;

public class Time2 {
    public static void main(String[] args) {
        // Starting time when you began the exercise
        int startHour = 14;    // 3:00 PM
        int startMinute = 30;   // 0 minutes
        int startSecond = 45;   // 0 seconds

        // Current time
        int currentHour = 15;    // 3:30 PM
        int currentMinute = 10;  // 30 minutes
        int currentSecond = 45;  // 45 seconds

        // Convert both times to seconds
        int startTimeInSeconds = startHour * 3600 + startMinute * 60 + startSecond;
        int currentTimeInSeconds = currentHour * 3600 + currentMinute * 60 + currentSecond;

        // Calculate elapsed time in seconds
        int elapsedSeconds = currentTimeInSeconds - startTimeInSeconds;

        System.out.println("Time elapsed since starting this exercise: " + elapsedSeconds + " seconds");
    }
}
