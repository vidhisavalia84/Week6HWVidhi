package homeworkweek6;
/*Write a program for a calculator with addition, subtraction, multiplication
 and division methods all with parameters and use string concatenation methods.
(Note: Two static and Two instance methods.)
 */

public class Programme5 {
    public static void main(String[] args) {
        addition();
        subtraction();
        Programme5 obj=new Programme5();
        obj.multiplication();
        obj.division();

    }
    public static void addition(){
        int a=20;
        int b=10;
        System.out.println("Addition of two number:");
        System.out.println(a+"+"+b+"="+(a+b));

    }
    public static void subtraction(){
        int s1=20;
        int s2=10;
        System.out.println("subtraction of two numbers:");
        System.out.println(s1+"-"+s2+"="+(s1-s2));
    }
    public void multiplication(){
        int m1=20;
        int m2=10;
        System.out.println("Multiplication of two numbers:");
        System.out.println(m1+"*"+m2+"="+(m1*m2));
    }
    public void division(){
        int d1=20;
        int d2=10;
        System.out.println("Division of two numbers:");
        System.out.println(d1+"/"+d2+"="+(d1/d2));
    }
}