package ap2;

public class Ap2 {
    public static void main(String[] args) {
       M m1 = new M();
       m1.run();
       
       M.go();
    }
}

class M{
    public void run(){          // 實例(instance)方法。必須透過物件來呼叫
        System.out.println("run");
    }
    
    public static void go(){    // 類別方法。可以透過 類別.方法()來呼叫
        System.out.println("go");
    }
}