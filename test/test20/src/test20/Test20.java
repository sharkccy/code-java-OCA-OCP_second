package test20;

import java.util.Scanner;

public class Test20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        for (int i = 0; i < no; i++) {
            int data[] = new int[10];
            for (int j = 0; j < 10; j++) {
                data[j] = sc.nextInt();
            }
            int end = isOrder(data);
            if (end == -1) {
                System.out.println("Unordered");
            } 
            else {
                System.out.println("Ordered");
            }
        }
    }

    public static int isOrder(int m[]) {
        if (m[0] > m[1]) {
            for (int i = 0; i < m.length - 1; i++) {
                if (m[i] < m[i + 1]) {
                    return -1;
                }
            }
        } 
        else {
            for (int i = 0; i < m.length - 1; i++) {
                if (m[i] > m[i + 1]) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
