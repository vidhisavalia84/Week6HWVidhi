package homeworkweek6;

public class Programme4 {
    int a = 10;
    int b = 20;
    static int c = 30;
    static int d = 40;

    public static void main(String[] args) {
        Programme4 obj2 = new Programme4();
        obj2.Programme41();
        Programme42();

    }

    public void Programme41() {
        System.out.println(a);
        System.out.println(b);
        Programme4 obj = new Programme4();
        System.out.println(obj.c);
        System.out.println(obj.d);

    }

    public static void Programme42() {
        Programme4 obj1 = new Programme4();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(c);
        System.out.println(d);


    }
}
