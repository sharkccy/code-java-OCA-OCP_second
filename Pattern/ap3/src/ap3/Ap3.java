package ap3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ap3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Matcher m1;
        do{
            System.out.println("請輸入手機號碼，ex：0912-345678");
            String tel = sc.next();
            Pattern p1 = Pattern.compile("\\d\\d\\d\\d-\\d\\d\\d\\d\\d\\d");    // \\d表示一個數字

            Pattern p2 = Pattern.compile("\\d{4}-\\d{6}");      //也可用大括號表次數
            m1 = p2.matcher(tel);

            if (m1.find()) {
                System.out.println("格式正確");
                 break;
            } 
            else {
                System.out.println("格式錯誤");
               
            }
        }
        while(!m1.find());
        
    }
}
