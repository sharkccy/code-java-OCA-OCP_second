package ap2;

import java.util.Scanner;

public class Ap2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入整數1:");
        int a = sc.nextInt();
        System.out.println("請輸入整數2:");
        int b = sc.nextInt();
        System.out.println("請輸入整數3:");
        int c = sc.nextInt();
        
        
        int tmp = a > b ? a : b;
        int max = c > tmp ? c : tmp;
        System.out.println("數字最大為:" + max);
    }
}
