package ap5;

public class Ap5 {

    public static void main(String[] args) {
        R r1 = new R();
        R r2 = new R();
    }
}

class R {

    public R() {                    // 建構子
        System.out.println("ok");
    }

    static {                 // static block(區塊)。會比建構子更早執行，而且只執行一次
        System.out.println("Right");
    }
}
