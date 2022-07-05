package ap1;

import java.util.Locale;

public class Ap1 {
    public static void main(String[] args) {
       Locale la = new Locale("zh", "TW");
        System.out.println(la.getDisplayCountry());
        
        System.out.println(la.getDisplayLanguage());
    }
}
