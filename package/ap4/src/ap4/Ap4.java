package ap4;

import pkg_A.Moto;

public class Ap4 {

    public static void main(String[] args) {
        Yamaha m = new Yamaha();
        m.a = 2;
//        m.b = 3;  錯，不同package
//        m.c = 4;  錯，Ap4非Moto的子類別
//        m.d = 5;  錯，只能在同一個class存取
    }
}

class Yamaha extends Moto {

    public void show() {
        this.a = 2;
        //this.b = 3;   錯，不同package
        this.c = 4; // 可以，因為Yamaha是Moto的子類別
        //this.d = 5;   錯，只能在同一個class存取
    }
}
