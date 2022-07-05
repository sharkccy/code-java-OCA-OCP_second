package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
       
 Scanner sc = new Scanner(System.in);
      
  int pwd;
     
   int no = 0;
  
      do {
     
       System.out.println("請輸入密碼：");
     
       pwd = sc.nextInt();
        
    no++;
          
  if (pwd != 123) {
         
       System.out.println("Error!!");
  
          }
            else {
         
       System.out.println("Right!!");
        
    }
        }
        while(pwd != 123 && no < 3);

    }
}


