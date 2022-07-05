package ap2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class Ap2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入密碼: ");
        String a = sc.next();
        int login = 0;
        BufferedReader br = new BufferedReader(new FileReader("src/pwd.txt"));
        String en;
        while ((en = br.readLine()) != null) {
            if (en.equals(a)) {
                login = 1;
                break;
            }
        }
        if (login == 1) {
            System.out.println("密碼正確");
        } 
        else {
            System.out.println("密碼錯誤");
        }
        br.close();
    }
}
