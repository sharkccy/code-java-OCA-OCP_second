package test25;

import java.util.Scanner;

public class Test25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {                      
            int start = sc.nextInt();
            if(start == 0){
                break;
            }
            int max = 0;  
            int end = sc.nextInt();
            for (int i = start; i <= end; i++) {
                int num = isOdd(i);
                if (num > max) {
                    max = num;
                }
            }
            System.out.println(start + " " + end + " " + max);
        }
    }

    public static int isOdd(int no) {
        int time = 1;
        while (no != 1) {
            if (no % 2 != 0) {
                no = no * 3 + 1;
            } 
            else {
                no = no / 2;
            }
            time += 1;
        }
        return time;
    }
}
