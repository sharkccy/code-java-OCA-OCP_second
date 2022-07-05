package ap3;

public class Ap3 {
    public static void main(String[] args) {
       play();
       // go(); 錯，類別方法不可以呼叫實例方法
       
       Ap3 a = new Ap3();
       a.go();
       
       A a2 = new A();
       a2.sh();
    }
    
    public static void play(){
        System.out.println("PS2");
    }
    
    public void go(){
        System.out.println("go");
    }
}

class A{
    public void sh(){
        System.out.println("Hi");
        sh2();
        sh3();
    }
    public void sh2(){
        System.out.println("Hello");
    }
    public void sh3(){
        System.out.println("yeah");
    }
}