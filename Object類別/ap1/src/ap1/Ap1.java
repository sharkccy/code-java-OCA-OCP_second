package ap1;

public class Ap1 {

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1.getClass());  // getClass()會回傳物件所屬類別

        System.out.println(a1.equals(a2));
        a1 = a2;
        System.out.println(a1.equals(a2));
    }
}

class A {

    public void run() {
        System.out.println("run");
    }
}
