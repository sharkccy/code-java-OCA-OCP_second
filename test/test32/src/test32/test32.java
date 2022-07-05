package test32;

import java.util.Scanner;

public class test32 {

	/**
	程式要放在命令提示字元裡執行。輸入完畢enter後再按：ctrl + z 
	*/
	public static void main(String[] args) {
		char[][] ch X= new char[100][100];
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int max = 0;
        while (sc.hasNext()) {
            String s = sc.nextLine();
            ch[n] = s.toCharArray();
            n++;
            if (s.length() > max) {
                max = s.length();
            }
        }
        for (int i = 0; i < max; i++) {
            for (int j = n - 1; j >= 0; j--) {//記得n - 1因為前面是算行數
                if (ch[j].length <= i) {
                    System.out.print(" ");
                } 
                else {
                    System.out.print(ch[j][i]);
                }
            }
            System.out.println();
        }
    }

}
