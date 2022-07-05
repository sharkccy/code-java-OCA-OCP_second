package ap3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ap3 {
    public static void main(String[] args) {
       try {
            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入整數: ");
            int no = sc.nextInt();
            System.out.println(5 / no);
        }
        catch(ArithmeticException e){   // 上層的例外類別不可以是下層的父類別     
            System.out.println(e);
            System.out.println("分母不得為0!!");
        }
       catch(InputMismatchException e2){
           System.out.println("資料型態不符!!");
       }
        finally{    // 不管catch是否有擷取到正確的錯誤例外，此區段的程式碼都會執行
            System.out.println("over");
        }

    }
}

