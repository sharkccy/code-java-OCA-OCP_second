package ap3_2;

public class Ap3_2 {
    public static void main(String[] args) {
       A a = new A();
       Thread th = new Thread(a);       //將a轉型為Thread類別(跟密碼字元陣列轉為字串的道理相同)
       th.start();
       a.come();
    }
}

class A implements Runnable{
    public void run(){
        for(long i = 1L;i < 6_000_000_000L;i++);    //空迴圈
        System.out.println("go");
    }
    
    public void come(){
        System.out.println("come");
    }
}