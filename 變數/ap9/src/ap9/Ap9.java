package ap9;

public class Ap9 {

    public static void main(String[] args) {
        int a;
        double b;
        String c;
        char d;
//        System.out.println(a);        錯，要給初始值
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);



        Test t = new Test();        //可
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);
        System.out.println(t.d);
    }
}

class Test {

    int a;
    double b;
    String c;
    char d;
}
