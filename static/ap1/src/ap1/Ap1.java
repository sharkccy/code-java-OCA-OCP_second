package ap1;

public class Ap1 {

    public static void main(String[] args) {
        T t1 = new T();
        t1.n = 6;
        System.out.println(t1.n);
        
        T t2 = new T();
        System.out.println(t2.n);
        
        System.out.println(t1.m);
        t1.m = 20;
        System.out.println(t2.m);
        t2.m = 30;
        System.out.println(t1.m);
    }
}

class T {

    int n = 5;  //  實例變數

    static int m = 5;   // 類別變數。由此類別所產生的物件所共有
}
