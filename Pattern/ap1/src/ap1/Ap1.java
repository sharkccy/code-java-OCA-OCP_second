package ap1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ap1 {

    public static void main(String[] args) {
        String s = "I love Taiwan";
        Pattern p = Pattern.compile("love");
        Pattern p2 = Pattern.compile("l*ve");//正規表示法(正則法 // * 表示任何的
        Pattern p3 = Pattern.compile("l..ve");//regex = regular express//. 表示任何一個字元
        Pattern p4 = Pattern.compile("l[aeiou]ve");// []表示括號內任何一個字
        Pattern p5 = Pattern.compile("l[a-n]ve");// 表示a-n之間任何一個字
        Pattern p6 = Pattern.compile("l[a-g,0-9,A-Z]ve");//可多條件
        Pattern p7 = Pattern.compile("l[^a-n]ve");// ^[a-n]表示不在a-n之間的任何一個字
        
        Matcher m = p7.matcher(s);
        if (m.find()) {
            System.out.println("found");
        } 
        else {
            System.out.println("not found");
        }
    }
}
