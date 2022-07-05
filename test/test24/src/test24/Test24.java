package test24;

import java.util.Scanner;

public class Test24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);          
        int no = sc.nextInt();
        while(no != 0){            
            String s = sc.next();
            int len = s.length() / no;
            for(int i = 0 ; i < s.length() ; i += len ){
                for(int j = i + len - 1 ; j >= i ; j--){
                    System.out.print(s.charAt(j));
                }
            }
            no = sc.nextInt();
        }
        
    }
    
}
