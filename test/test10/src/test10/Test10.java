package test10;

import java.util.Scanner;

public class Test10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        String[] str = new String[no];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println("==============================");
//        if (no % 2 == 0) {
            for (int i = 0; i < no; i += 2) {
                System.out.println(str[i]);
            }

            for (int i = no - 1 - (no % 2); i > 0; i -= 2) {    //直接判斷奇數偶數，不用再寫一個if else
                System.out.println(str[i]);
            }
        }

//        if (no % 2 != 0) {
//            for (int i = 0; i < no; i += 2) {
//                System.out.println(str[i]);
//            }
//            for (int i = no - 2; i > 0; i -= 2) {
//                System.out.println(str[i]);
//            }
//        }

    }

