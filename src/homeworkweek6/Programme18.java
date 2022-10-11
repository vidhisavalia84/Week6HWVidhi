package homeworkweek6;
//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
/*Expected Output : 125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5 125
        mod 24 = 5*/

import java.util.Scanner;

public class Programme18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = sc.nextInt();
        System.out.print("Input second number: ");
        int b = sc.nextInt();
        System.out.println("Expected output:");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " mod " + b + " =" + (a % b));

        System.out.println();

    }
}
