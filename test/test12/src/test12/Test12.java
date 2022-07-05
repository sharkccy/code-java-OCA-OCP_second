package test12;

import java.util.Scanner;

public class Test12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = new String[4];
        int[] no = new int[26];
        int i, j, max = 0;
        for (i = 0; i < 4; i++) {
            data[i] = sc.nextLine();
            for (j = 0; j < data[i].length(); j++) {
                if (Character.isUpperCase(data[i].charAt(j))) {
                    no[data[i].charAt(j) - 'A']++;
                }
            }
        }
        for (i = 0; i < no.length; i++) {
            if (no[i] > max) {
                max = no[i];
            }
        }
        for (i = max; i > 0; i--) {
            for (j = 0; j < no.length; j++) {
                if (no[j] >= i) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(char a = 'A' ; a <= 'Z';a++){       //要用char
            System.out.print(a);
        }
        System.out.println("");
    }
}
