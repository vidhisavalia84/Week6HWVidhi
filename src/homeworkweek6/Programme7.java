package homeworkweek6;
/*Write a program to insert any temperature value in degree Fahrenheit and
        convert to degree Celsius ((F − 32) × 5/9 = 0°C)*/

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in degree Fahrenheit: ");
        int a = sc.nextInt();
        float b = ((a - 32) * 5) / 9;
        System.out.println("Temperature in degree Celsius is: " + b);
sc.close();

    }
}
