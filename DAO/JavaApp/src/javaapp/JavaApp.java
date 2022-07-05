package javaapp;
/*
    為了維護容易而使用DAO架構
    ex:介面能夠清楚知道有哪些方法
*/
import java.util.Scanner;

public class JavaApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id , name , password;
        System.out.println("請輸入ID：");
        id = sc.next();
        System.out.println("請輸入姓名：");
        name = sc.next();
        System.out.println("請輸入密碼：");
        password = sc.next();
        Member m1 = new Member(id, name, password);
        DB_connect d = new DB_connect();
        d.insert(m1);
    }
}
