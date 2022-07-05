package ap4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ap4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int arr[] = new int[3];
            System.out.println(6 / a);
            System.out.println(arr[a]);
        } 
        catch (ArithmeticException | ArrayIndexOutOfBoundsException  | InputMismatchException e) {
            // multi-catch。左右不可以是父子類別關係
            System.out.println("算術或陣列索引或資料型態發生錯誤");
        }

    }
}
