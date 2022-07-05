package test23;

import java.util.Scanner;

public class Test23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一個數字:");
        int no = sc.nextInt();
        if (pali(no)) {
            System.out.println(no);
        } 
        else {
            while ( !pali(no) ) {       //注意while位置，不要放到上面去
                no = no + reverse(no);                
            }
            System.out.println(no);     //記得輸出
        }

    }

    public static int reverse(int n) {  //複習反轉寫法(一邊%/%/，另一邊*+*+)
        int sum = 0;
        while (n != 0) {
            int no2 = n % 10;
            sum = sum * 10 + no2;
            n /= 10;
        }
        return sum;
    }

    public static boolean pali(int no) {
        int a = reverse(no);
        if (no == a) {
            return true;
        }
        return false;
    }
}
