package javaapplication1_3;

public class JavaApplication1_3 {
    public static void main(String[] args) {
        int i, j;       
        for(i = 1; i <= 5; i++) {  // 輸出的列數
            for(j = 1; j <= 6-i; j++) {  // 每列執行幾次
                System.out.print("* ");
            }
             System.out.println();
        }  
       
    }
}
