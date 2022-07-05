package test18;

import java.util.Scanner;

public class Test18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 1;
        int sum = 0;
        while(a < num){
            a *= 2;
            sum++;
        }
        System.out.println(sum);


//        也可這樣寫        
//        int n = sc.nextInt();
//        int[] ar = new int[20];
//        for (int i = 0; i < 20; i++) {
//            ar[i] = (int) Math.pow(2, i);
//            if (n <= ar[i]) {
//                System.out.println(i);
//                break;
    }
}
