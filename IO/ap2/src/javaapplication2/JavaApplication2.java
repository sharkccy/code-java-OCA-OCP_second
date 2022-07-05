package javaapplication2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/member.csv"));
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("請輸入帳號：");
        String en1 = sc.next();
        System.out.println("請輸入密碼：");
        String en2 = sc.next();
        int login = 0;
        
        while ((s = br.readLine()) != null) {
            String[] m = s.split(",");
            if(m[0].equals(en1) && m[1].equals(en2)){
                login = 1;
                break;
            }
        }
        if(login == 1){
            System.out.println("登入成功!!");
        }
        else{
            System.out.println("帳號或密碼錯誤");
        }
        br.close();
    }
}
