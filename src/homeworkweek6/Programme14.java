package homeworkweek6;
/*Write a Java program to print the area and perimeter of a rectangle.
        Test Data: Width = 5.5 Height = 8.5
        Expected Output:
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20*/
public class Programme14 {
    public static void main(String[] args) {
        double w=5.6;
        double h=8.5;
        double a= w*h;
        double b=2*(w+h);
        System.out.println("Test Data: ");
        System.out.println("Width=5.5 Height=8.5");
        System.out.println("Area is 5.6*8.5 =  "+a);
        System.out.println("Parameter is 2 * (5.6+8.5) = "+b);

    }
}
