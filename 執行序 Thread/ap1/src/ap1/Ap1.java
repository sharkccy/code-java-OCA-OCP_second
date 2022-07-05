package ap1;

public class Ap1 {
    public static void main(String[] args) {
       A a = new A();
       a.go();
       a.come();
    }
}

class A{
    public void go(){
        for(long i = 1L;i < 6_000_000_000L;i++);    //空迴圈
        System.out.println("go");
    }
    
    public void come(){
        System.out.println("come");
    }
}