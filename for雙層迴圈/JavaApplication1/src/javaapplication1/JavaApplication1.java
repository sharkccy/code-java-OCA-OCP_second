package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        int i, j;       
        for(i = 1; i <= 2; i++) {  // 輸出的列數
            for(j = 1; j <= 3; j++) {  // 每列執行幾次
                System.out.print("* ");
            }
             System.out.println();
        }       
    }
}
