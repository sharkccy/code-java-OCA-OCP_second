
import java.util.Scanner;

public class Java_VerticalHistogram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] m = new String[4];
        int[] hist = new int[26];

        int i, j;
        for (i = 0; i < m.length; i++) {
            m[i] = sc.nextLine();
            for (j = 0; j < m[i].length(); j++) {
                if (Character.isUpperCase(m[i].charAt(j))) {  // 判斷是否是大寫字母
                    hist[m[i].charAt(j) - 'A']++;
                }
            }
        }

        int max = hist[0];
        for (i = 1; i < hist.length; i++) {
            if (hist[i] > max) {
                max = hist[i];
            }
        }

        for (i = max; i >= 0; i--) {
            for (j = 0; j < 26; j++) {
                if (hist[j] > i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (i = 0; i < 26; i++) {
            System.out.printf("%c ", 'A' + i);
        }
        System.out.println();
    }
}
