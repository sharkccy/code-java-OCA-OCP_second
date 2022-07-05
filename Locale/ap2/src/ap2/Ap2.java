package ap2;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Ap2 {

    public static void main(String[] args) {
        System.out.println("1-中文     2-Spanish     3-Germany");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                Locale tw = new Locale("zh", "TW");
                //語系小寫，國名大寫
                ResourceBundle rb = ResourceBundle.getBundle("data", tw);
                //data副檔名要是properties   
                System.out.println(rb.getString("msg"));
                break;
            case 2:
                Locale es = new Locale("es", "ES");
                //data檔後面要加_語系_國名
                ResourceBundle rb2 = ResourceBundle.getBundle("data", es);
                System.out.println(rb2.getString("msg"));
                break;
            case 3:
                Locale de = new Locale("de", "DE");
                //data檔後面要加_語系_國名
                ResourceBundle rb3 = ResourceBundle.getBundle("data", de);
                System.out.println(rb3.getString("msg"));
                break;
        }

    }
}
