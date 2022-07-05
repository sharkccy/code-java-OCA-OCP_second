package ap7;

public class Ap7 {

    public static void main(String[] args) {
        B b1 = new B();
        System.out.println(b1.n1);
        B b2 = new B();
        //b2.n2 = 6;  錯，介面變數不可修改(final)
        
    }
}

interface A {

    int n1 = 5;

    public static final int n2 = 7;     //介面變數的預設宣告
}

class B implements A{

}