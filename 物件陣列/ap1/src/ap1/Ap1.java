package ap1;

public class Ap1 {

    public static void main(String[] args) {
        int[] id;
        id = new int[5];

        Moto[] n = new Moto[3];  // 宣告一個包3個物件的物件陣列，尚未產生物件
        for (int i = 0; i < n.length; i++) {
            n[i] = new Moto();      //產生物件
        }
        
        Moto[] n2 = {new Moto(),new Moto()}; //// 產生2個匿名物件，此為匿名物件陣列
    }
}

class Moto {

    public Moto() {
        System.out.println("Yamaha");
    }

    public void run() {
        System.out.println("Go traveling");
    }
}
