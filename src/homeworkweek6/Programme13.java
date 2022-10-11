package homeworkweek6;
import java.util.Scanner;
public class Programme13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first No: ");
        int a= sc.nextInt();
        System.out.println("Enter second No: ");
        int b= sc.nextInt();
        System.out.println("Enter third No:  ");
        int c= sc.nextInt();
        double d= a+b+c/3;
        System.out.println("Average of three No is:  ");
        System.out.println(    a +"+" +b+"+"+ c+"/"+"3"+" = " +d  );

    }
}
