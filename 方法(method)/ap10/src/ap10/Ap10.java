package ap10;

public class Ap10 {

    public static void main(String[] args) {
        sum(2 , 5 , 7);  // m = 2
        sum(3);
        sum(3);
    }

    public static void sum(int m, int... a) {   //...要放在最後一個參數
        int s = 0;
        for (int n : a) {
            s += n;
        }
        System.out.println(s - m);
    }
}
