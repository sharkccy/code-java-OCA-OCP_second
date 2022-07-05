package ap9;

import java.util.Random;
import java.util.TreeSet;

public class Ap9 {
    public static void main(String[] args) {
       TreeSet<Integer> ts = new TreeSet<>();
       Random r = new Random();
       while(ts.size() < 6){
           int no = r.nextInt(49) + 1;      //產生1 ~ 49 的隨機數
           ts.add(no);
       }
        System.out.println(ts);
    }
}
