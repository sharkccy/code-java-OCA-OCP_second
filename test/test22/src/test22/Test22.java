package test22;

import java.util.Scanner;

public class Test22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        String data = "";
        int end[] = new int[10];
        for (int i = 0; i < no; i++) {
            data += i;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < data.length(); j++) {
                if (data.charAt(j) == i) {
                    end[i]++;
                }
            }
        }
        for(int i = 0; i < end.length;i++){
            System.out.print(end[i] + " ");
        }
    }
}
