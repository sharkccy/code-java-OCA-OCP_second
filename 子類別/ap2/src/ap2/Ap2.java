package ap2;

public class Ap2 {
    public static void main(String[] args) {
        Moto m1 = new Moto();
        m1.go();
        
       Kymco k1 = new Kymco();
       k1.go();                 // 呼叫子類別改寫的方法
       k1.run();
    }
}

class Moto{                     //父類別
    public void go(){
        System.out.println("Go");
    }
}

class Kymco extends Moto{       // 改寫(Overriding)
    @Override
    public void go(){
        System.out.println("Go around the island");
    }
    
    public void run(){
        System.out.println("Run");
    }
}