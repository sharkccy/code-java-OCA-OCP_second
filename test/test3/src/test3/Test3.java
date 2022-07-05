package test3;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no, up = 0, down = 0, times = 0 , k = 1;
        times = sc.nextInt();
        while (times-- != 0) {
            no = sc.nextInt();
        int[] arr = new int[no];
        for (int i = 0; i < no; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                down++;
            } else if (arr[j] < arr[j + 1]) {
                up++;
            }
        }
        System.out.println("Case " + k + ": " + up + "  " + down);
        k++;
        up = 0;
        down = 0;        
        }        
    }
}
