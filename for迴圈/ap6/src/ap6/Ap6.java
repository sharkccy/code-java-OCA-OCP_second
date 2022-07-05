package ap6;

import java.util.Scanner;

public class Ap6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int i, sum = 0;
        System.out.println(no + "的因數有:");
        for (i = 2; i <= no; i++) {
            if (no % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("總合為:" + sum);
    }
}
