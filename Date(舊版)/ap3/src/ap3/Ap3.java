package ap3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ap3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入生日，例如：1985/11");
        Date d = new Date();
        String s1 = sc.next();
        String[] d1 = s1.split("/");

        DateFormat df = DateFormat.getDateInstance();
        String s2 = df.format(d);
        String[] d2 = s2.split("/");

        int y1 = Integer.parseInt(d1[0]);// 出生年
        int y2 = Integer.parseInt(d2[0]);// 今年
        int m1 = Integer.parseInt(d1[1]);// 出生月
        int m2 = Integer.parseInt(d1[1]);// 今年

        int y3, m3;
        if (m1 > m2) {
            y3 = y2 - y1 - 1;
            m3 = 12 + m2 - m1;
        } else {
            y3 = y2 - y1;
            m3 = m2 - m1;
        }
        System.out.println("實際年齡：" + (y3 % 1911) + "歲" + m3 + "個月");
    }
}
