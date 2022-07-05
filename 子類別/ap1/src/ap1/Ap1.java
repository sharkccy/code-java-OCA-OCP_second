package ap1;

public class Ap1 {
    public static void main(String[] args) {
       Kymco k1 = new Kymco();
       k1.go();                 // 繼承自父類別
       k1.run();
    }
}

class Moto{                     //父類別
    public void go(){
        System.out.println("Go");
    }
}

class Kymco extends Moto{       //子類別
    public void run(){
        System.out.println("Run");
    }
}