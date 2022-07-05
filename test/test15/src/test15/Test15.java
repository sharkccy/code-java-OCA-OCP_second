package test15;

import java.util.Scanner;

public class Test15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 1;
        while (true) {            
            int start = sc.nextInt();
            int end = sc.nextInt();
            int sum = 0;
            if (start == 0 && end == 0) {
                break;
            }
            else {
                for (int i = start; i <= end; i++) {
                    int tmp = NumberOfOne(i);
                    sum = sum + tmp;
                }
                System.out.println("case " + k + ": " + sum);
                k++;
            }
        }

    }

    public static int NumberOfOne(int n) {
        int no = 0;
        while (n != 0) {
            int a = n % 2;
            if (a == 1) {
                no++;
            }
            n /= 2;
        }
        return no;
    }
}
