package ap3;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Ap3 {

    public static void main(String[] args) {
        System.out.println("Please Choose(請輸入):1-中文     2-Spanish     3-Germany");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                int score = 0;
                Locale tw = new Locale("zh", "TW");
                ResourceBundle rb = ResourceBundle.getBundle("data", tw);
                for (int i = 1; i < 6; i++) {
                    System.out.println(rb.getString("" + i));
                    int ans = sc.nextInt();
                    if(ans == i){
                        score += 20;
                    }
                }
                System.out.println(rb.getString("6") + score);
                break;
            case 2:
                int score2 = 0;
                Locale es = new Locale("es", "ES");
                ResourceBundle rb2 = ResourceBundle.getBundle("data", es);
                for (int i = 1; i < 6; i++) {
                    System.out.println(rb2.getString("" + i));
                    int ans = sc.nextInt();
                    if(ans == i){
                        score2 += 20;
                    }
                }
                System.out.println(rb2.getString("6") + score2);
                break;
            case 3:
                int score3 = 0;
                Locale de = new Locale("de", "DE");               
                ResourceBundle rb3 = ResourceBundle.getBundle("data", de);
                for (int i = 1; i < 6; i++) {
                    System.out.println(rb3.getString("" + i));
                    int ans = sc.nextInt();
                    if(ans == i){
                        score3 += 20;
                    }
                    System.out.println(rb3.getString("6") + score3);
                }
                break;
        }

    }
}
