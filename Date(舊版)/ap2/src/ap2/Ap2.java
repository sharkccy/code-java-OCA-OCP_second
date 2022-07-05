package ap2;

import java.text.DateFormat;
import java.util.Date;

public class Ap2 {

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        DateFormat df = DateFormat.getDateInstance();
        System.out.println(df.format(d));
        
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.DEFAULT);
        System.out.println(df2.format(d));
        
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df3.format(d));
        
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(df4.format(d));
    }
}
