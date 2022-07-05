package javaapplication_test2;

import java.util.Scanner;

public class JavaApplication_test2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       
 System.out.println("請輸入數字：");
       
 int a = sc.nextInt();
      
  int i, j;
     
   for(i = 1; i <= a; i++) {
       
     for(j = 1; j <= i; j++) {
   
             System.out.print(i);
   
             a--;
   
             if(a == 0){
        
            break;
                }
    
        }
            System.out.println();
  
      }
       
    }
}
