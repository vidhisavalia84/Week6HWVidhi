package homeworkweek6;

//Write a Java program to swap two variables.
public class Programme15 {
    public static void main(String[] args) {
        int x = 20;
        int y = 40;
        System.out.println("Before swap  ");
        System.out.println("x= " + x);
        System.out.println("y= " + y);

        int temp;
        temp = x;
        x = y;
        y = x;
        //int a=temp;
        //int y=
        System.out.println("After swap  ");
        System.out.println("x= " + x);
        System.out.println("y= " + y);


    }
}
