package test30_2;

public class Test30_2 {
    public static void main(String[] args) {
       int a =13;
       int b = 9;
        System.out.println(a ^ b);  // ^ 表示互斥運算 (XOR)
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
