package homeworkweek6;
//Area of Tringle=1/2*H*B(height*base)

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
        //int a;
        // int b;
        //int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of Tringle:  ");
        int b = sc.nextInt();
        System.out.println("Please enter the base of Tringle:  ");
        int c = sc.nextInt();
        float a = (b * c) / 2;
        System.out.println("The Area of Tringle is: " + a);
                sc.close();


    }
}
