package test31;

import java.util.Scanner;

public class Test31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4 };
		int times = sc.nextInt();
		sc.nextLine(); // 注意此行
		int i, j;
		for (i = 1; i <= times; i++) {
			int sum = 0; // 要放在裡面，不然不會歸零
			String s = sc.nextLine();
			for (j = 0; j < s.length(); j++) {
				if (Character.isLetter(s.charAt(j))) {// 為字母
					sum += ar[s.charAt(j) - 'a']; // 直接寫-'a' , 就不用背97了

				} else { // 此格為空白
					sum++;
				}
			}
			System.out.println("Case #" + i + ":" + sum);
		}

	}
}
