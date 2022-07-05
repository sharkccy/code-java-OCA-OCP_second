package javaapplication3;

public class JavaApplication3 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.go();
        c1.run();
       
    }
}

abstract class A {
    public abstract void go();
}

abstract class B extends A {  // 抽象子類別
    public abstract void run();
}

class C extends B {
    public void go(){
        System.out.println("Go");
    }
    
    public void run(){
        System.out.println("Run");
    }
}