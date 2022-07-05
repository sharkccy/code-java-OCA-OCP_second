package test9;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
        int b = sc.nextInt();
        int N = sc.nextInt();        
        System.out.print(a / b + ".");
        int i;
        for(i = 1; i <= N; i++) {
            a = (a % b )*10;
            System.out.print(a / b);
        }
        System.out.println();
    }
}
