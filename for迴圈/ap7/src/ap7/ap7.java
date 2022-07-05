package ap7;

import java.util.Scanner;

public class ap7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int i, tmp;
        if (start > end) {
            tmp = start;
            start = end;
            end = tmp;
        }
        
        System.out.println("在" + start + "到" + end + "之間，六的倍數有");
        for (i = start; i <= end; i++) {
            if (i % 6 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
