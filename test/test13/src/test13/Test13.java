package test13;

import java.util.Scanner;
import java.util.TreeMap;

public class Test13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        int k = 0;
        char[] ch = new char[s1.length() * s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    ch[k++] = s1.charAt(i);
                }
            }
        }
        for (int i = 'a'; i < 'z'; i++) {
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == i) {
                    System.out.print(ch[j]);
                    break;
                }
            }
        }

    }
}
