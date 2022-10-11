package homeworkweek6;
import java.util.Scanner;
public class Programme16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first binary number: ");
        String a= sc.next();
        System.out.println("Enter second binary number: ");
        String b=sc.next();

        int b1=Integer.parseInt(a,2);
        int b2=Integer.parseInt(b,2);
        int b3=b1+b2;
        //System.out.println("b1: "+Integer.toBinaryString(b1));
       //System.out.println("b2: "+Integer.toBinaryString(b2));
        System.out.println("Sum of two binary number:");
        System.out.println(Integer.toBinaryString(b3));

    }
}
