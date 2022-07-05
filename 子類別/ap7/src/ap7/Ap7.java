package ap7;

public class Ap7 {

    public static void main(String[] args) {
        A a1 = new A();

        B b1 = new B();
        
        B b2 = new B();

    }
}

class A {

    public A() {    // 預設建構子

    }

    public A(int n) {
        System.out.println("xx");
    }
}

class B extends A {   // 會先呼叫父類別的預設建構子，若沒有A的預設建構子會錯

    public B() {
        super(0);     // 呼叫父類別的建構子
    }

    public B(int a, int b) {
        System.out.println("yy");
    }
}
