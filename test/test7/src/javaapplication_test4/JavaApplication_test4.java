package javaapplication_test4;

import java.util.Scanner;

public class JavaApplication_test4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸數字：");
        int no = sc.nextInt();
        int no2 = no;
        int sum = 0;

        while (no != 0) {
            int a = no % 10;
            sum = sum * 10 + a;
            no /= 10;
        }       
        if (sum == no2) {
            System.out.println("迴文");
        } else {
            System.out.println("不是迴文");
        }
    }
}
