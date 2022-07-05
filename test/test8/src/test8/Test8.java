package test8;

import java.util.Scanner;

public class Test8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int no = 1;
        int i;
        for (i = 0; i < s1.length() - 1; i++) {
            if (s1.charAt(i) == s1.charAt(i + 1)) {
                no++;
            }
            else {
                System.out.print(no + "" + s1.charAt(i));
                no = 1;
            }
        }
        System.out.println(no + "" + s1.charAt(i));
    }
}
