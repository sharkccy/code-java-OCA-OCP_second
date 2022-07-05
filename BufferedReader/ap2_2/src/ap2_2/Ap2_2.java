package ap2_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ap2_2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       Scanner sc = new Scanner(System.in);
        System.out.println("請依序輸入帳號、密碼: ");
        String acc = sc.next();
        String pwd = sc.next();
        int login = 0;
        BufferedReader br = new BufferedReader(new FileReader("src/pwd.txt"));
        String en;  
        String[] str= new String[2];
        while ((en = br.readLine()) != null) {
            str = en.split(":");
            if(str[0].equals(acc) && str[1].equals(pwd)){
                login = 1;
            }
        }
        if (login == 1) {
            System.out.println("登入成功");
        } 
        else {
            System.out.println("帳號或密碼錯誤");
        }
        br.close();
    }
}