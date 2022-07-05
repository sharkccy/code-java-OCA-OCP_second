package test2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();  
        String s2 = "";        
        for (int i = s.length() - 1; i >= 0; i--) {
            s2 = s2 + s.charAt(i);
        }
        if(s.equals(s2)){
            System.out.println("是回文");
        }
        else{
            System.out.println("不是回文");
        }        
    }
}
