package ap8;

public class Ap8 {

    public static void main(String[] args) {
        B b1 = new B();
        b1.go2();
        
        B b2 = new B();
        b2.go3();
    }
}

class A {

    public void go() {
        System.out.println("go");
    }
}

class B extends A{
    @Override
    public void go(){   // 改寫
        System.out.println("go go");
    }
    
    public void go2() {
        System.out.println("go2");
        this.go3();     // this.go3()指的是呼叫類別B的go3方法。不需要放在第一列
    }

    public void go3() {
        System.out.println("go3");
        super.go();     // 呼叫父類別的方法(非建構子)。不需要放在第一列
    }
}
