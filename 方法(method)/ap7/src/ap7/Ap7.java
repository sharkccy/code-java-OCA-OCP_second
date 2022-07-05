package ap7;

import java.util.Scanner;

public class Ap7 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("請輸入數字：");
        int a = sc.nextInt();
        int i, j;
        int b = a;        
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
                b--;
                if (b == 0) {
                    System.out.println();
                    return;
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
