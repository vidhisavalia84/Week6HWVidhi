package homeworkweek6;
//Write a program to enter any radius value of the circle
// and find out the area.(Formula of Area A=PI*r*r).

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre radious of circle");
        int a = sc.nextInt();
        double radious = 3.14 * a * a;
        System.out.println("Area of circle is = " + radious);
        sc.close();

    }
}
