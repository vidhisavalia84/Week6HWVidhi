package homeworkweek6;

public class Programme3 {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        Programme3 obj3 = new Programme3();
        obj3.MyName3();
        MyName31();

    }

    public void MyName3() {
        System.out.println(a);
        Programme3 obj = new Programme3();
        System.out.println(obj.b);

    }

    public static void MyName31() {
        Programme3 obj1 = new Programme3();
        System.out.println(obj1.a);
        System.out.println(b);

    }
}
