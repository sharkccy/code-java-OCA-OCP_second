package test32;

import java.util.Scanner;

public class test32 {

	/**
	�{���n��b�R�O���ܦr���̰���C��J����enter��A���Gctrl + z 
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
            for (int j = n - 1; j >= 0; j--) {//�O�on - 1�]���e���O����
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
