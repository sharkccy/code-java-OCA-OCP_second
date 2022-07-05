package ap3;

public class Ap3 {

    public static void main(String[] args) {
        B b1 = new B();
        b1.sh();
        b1.sh2();

        C c1 = new C();
        c1.sh();
        c1.sh2();
        c1.sh3();
    }
}

class A {

    public void sh() {
        System.out.println("A called");
    }
}

class B extends A {

    public void sh2() {
        System.out.println("B called");
    }
}

class C extends B {

    public void sh3() {
        System.out.println("C called");
    }
}
