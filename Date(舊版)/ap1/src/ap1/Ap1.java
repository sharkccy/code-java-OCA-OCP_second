package ap1;

import java.text.DateFormat;
import java.util.Date;

public class Ap1 {

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        
        DateFormat df = DateFormat.getInstance();
        System.out.println(df.format(d));
    }
}
