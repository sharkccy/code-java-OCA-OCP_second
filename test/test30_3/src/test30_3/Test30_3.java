package test30_3;

public class Test30_3 {
    public static void main(String[] args) {
       int[] ar = {1, 1, 4, 4, 7, 7, 3, 6, 6, 8, 8, 5, 5 };
       int n = 0;
        for (int i = 0; i < ar.length; i++) {
            n = n ^ ar[i];      //跟0做XOR得到自己，跟自己做XOR得到0，XOR順序可互換
        }                       //所以只出現奇數次就等於無法變成0 => 輸出
        System.out.println(n);
    }
}
