package javaapplication_test3;

import java.util.Scanner;

public class JavaApplication_test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸數字：");
        int no = sc.nextInt();
        int sum = 0;
        
        while(no != 0) {
            int a = no % 10;
            sum = sum * 10 + a;
            no /= 10;
        }
        System.out.println(sum);
    }
}
