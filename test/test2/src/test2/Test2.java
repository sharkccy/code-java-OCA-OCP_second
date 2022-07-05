package test2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入測驗次數：");
        int no = sc.nextInt();
        System.out.println("請依序輸入得分：");
               
        int[] arr = new int[no];
        int i;
        for(i = 0; i < no; i++){
            arr[i] = sc.nextInt();  
        }        
        System.out.println("您的分數依序為：");
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
       
    }
}
