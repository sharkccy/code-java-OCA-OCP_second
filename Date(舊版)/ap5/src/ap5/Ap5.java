package ap5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ap5 {

    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("HH時mm分  MM月dd日Y年");  
        System.out.println(sf.format(d));
    }
}
