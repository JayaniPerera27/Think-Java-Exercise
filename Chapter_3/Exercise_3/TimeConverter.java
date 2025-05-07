package Chapter_3.Exercise_3;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter total number of seconds: ");

        int totalSeconds = in.nextInt();

        int hours = totalSeconds / 3600;
        int remainder = totalSeconds % 3600;
        int minutes = remainder / 60;
        int seconds = remainder % 60;

        // 4. Display the result using printf
        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n",
                totalSeconds, hours, minutes, seconds);
    }
}