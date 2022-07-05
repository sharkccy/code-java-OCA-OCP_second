package test26;

import java.util.Scanner;

public class Test26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 1;
        while (i < s.length()) {
            s = s.substring(i);
            System.out.print(s + " ");
        }
//       while(s.length() != 0){           
//           s = s.substring(1 , s.length());
//           System.out.println(s);
//       }
    }
}
