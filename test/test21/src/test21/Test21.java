package test21;

import java.util.Scanner;

public class Test21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        while (time-- != 0) {
            String data = sc.next();
            int no = 0;
            int score = 0;
            for (int i = 0; i < data.length(); i++) {
                if (data.charAt(i) == 'O') {
                    no++;
                    score += no;
                } else {
                    no = 0;
                }
            }
            System.out.println(score);
        }
    }
}
