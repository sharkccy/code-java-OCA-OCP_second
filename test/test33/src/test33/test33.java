package test33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		while (times-- > 0) {
			ArrayList<String> ar = new ArrayList<>();
			String s = sc.next();
			int i;
			for (i = 0; i < s.length(); i++) {
				String s2 = s.substring(i, s.length()) + s.substring(0, i);
				ar.add(s2);
			}
			Collections.sort(ar);		//�O��A�n��
			System.out.println(ar.get(0));
			//��ArrayList �N�i�H��������X�ӿ�X�A���Υ�TreeSet�A��X�·�
		}
			
	}

}
