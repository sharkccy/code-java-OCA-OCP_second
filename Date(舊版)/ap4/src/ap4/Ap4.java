package ap4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ap4 {

    public static void main(String[] args) {
        Date d = new Date();

        SimpleDateFormat sf = new SimpleDateFormat("MMM" , Locale.US);  //若沒有Locale為中文
        System.out.println(sf.format(d));
              
        SimpleDateFormat sf2 = new SimpleDateFormat("D");   //"D"表示今天是今年的第幾天
        System.out.println(sf2.format(d));                   //"d"表示今天幾號
        
        SimpleDateFormat sf3 = new SimpleDateFormat("h");   //  顯示小時，12小時制
        System.out.println(sf3.format(d));
        
        SimpleDateFormat sf4 = new SimpleDateFormat("H");   //  顯示小時，24制
        System.out.println(sf4.format(d));
        
        SimpleDateFormat sf5 = new SimpleDateFormat("a", Locale.US);    //  顯示AM or PM
        System.out.println(sf5.format(d));
        
        SimpleDateFormat sf6 = new SimpleDateFormat("YY");  //顯示後兩位
        System.out.println(sf6.format(d));
    }
}
