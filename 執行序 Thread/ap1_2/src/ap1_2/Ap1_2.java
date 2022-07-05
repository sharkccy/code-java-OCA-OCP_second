package ap1_2;

public class Ap1_2 {
    public static void main(String[] args) {
       A a = new A();
       a.start();       //透過執行序來執行方法，需呼叫start()
       a.come();
    }
}

class A extends Thread{
    public void run(){
        for(long i = 1L;i < 6_000_000_000L;i++);    //空迴圈
        System.out.println("go");
    }
    
    public void come(){
        System.out.println("come");
    }
}