package ap1;

import java.util.Scanner;

public class Ap1 {
    public static void main(String[] args) {
        //System.out.println(5 / 0);  //產生 ArithmeticException (算術例外)
        
        int[] arr = new int[5];
        //System.out.println(arr[5]);     //產生 ArrayIndexOutOfBoundsException (陣列索引超出邊界例外)
        
        String s = "abc";
        //System.out.println(s.charAt(3));  // 產生StringIndexOutOfBoundsException (字串索引超出邊界例外)
        
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入整數: ");
        int no = sc.nextInt();
        // 如果輸入的值非整數，會產生InputMismatchException(輸入型態不符)
    }
}
