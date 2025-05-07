package Chapter_3.Exercise_3;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a temperature in Celsius: ");

        double celsius = in.nextDouble();

        double fahrenheit = celsius * 9.0 / 5.0 + 32;

        System.out.printf("%.1f C = %.1f F\n", celsius, fahrenheit);
    }
}
