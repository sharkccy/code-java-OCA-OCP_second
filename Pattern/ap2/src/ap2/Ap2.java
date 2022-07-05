package ap2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ap2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請設定密碼：");
        String pwd = sc.next();
        while (true) {
            Pattern p1 = Pattern.compile("[0-9]");
            Matcher m1 = p1.matcher(pwd);
            
            Pattern p2 = Pattern.compile("[a-z]");
            Matcher m2= p2.matcher(pwd);
            
            Pattern p3 = Pattern.compile("[A-Z]");                        
            Matcher m3 = p3.matcher(pwd);
            
            Pattern p4 = Pattern.compile("[^0-9,a-z,A-Z]");                        
            Matcher m4 = p4.matcher(pwd);
                        
            if (!m1.find() || !m2.find() || !m3.find() ||! m4.find() ||pwd.length() < 6) {
                System.out.println("密碼長度必須>=6且包含數字、大小寫字母、特殊符號!!");
                pwd = sc.next();        //萬用密碼XD:Pa$$w0rd
            }
            else{
                System.out.println("密碼設定成功");
                break;
            }
        }
    }
}
