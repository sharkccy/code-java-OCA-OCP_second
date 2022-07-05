package ap2;

import java.util.Scanner;

public class Ap2 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入整數: ");
            int no = sc.nextInt();
            System.out.println(5 / no);
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("分母不得為0");
        }
        finally{    // 不管catch是否有擷取到正確的錯誤例外，此區段的程式碼都會執行
            System.out.println("over");
        }

    }
}
