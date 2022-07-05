package javaapplication2;

public class JavaApplication2 {

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            if (i % 5 == 0) {
                break; // 結束迴圈
            }
            System.out.print(i + "  ");
        }
        System.out.println();

        for (i = 1; i <= 10; i++) {            
            if (i % 3 == 0) {
                continue; 
            }         
            System.out.print(i + "  ");
        }
        System.out.println();
    }
}
