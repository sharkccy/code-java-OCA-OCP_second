package test31;

import java.util.Scanner;

public class Test31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4 };
		int times = sc.nextInt();
		sc.nextLine(); // �`�N����
		int i, j;
		for (i = 1; i <= times; i++) {
			int sum = 0; // �n��b�̭��A���M���|�k�s
			String s = sc.nextLine();
			for (j = 0; j < s.length(); j++) {
				if (Character.isLetter(s.charAt(j))) {// ���r��
					sum += ar[s.charAt(j) - 'a']; // �����g-'a' , �N���έI97�F

				} else { // ���欰�ť�
					sum++;
				}
			}
			System.out.println("Case #" + i + ":" + sum);
		}

	}
}
