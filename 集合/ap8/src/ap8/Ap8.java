package ap8;

import java.util.TreeSet;

public class Ap8 {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();      //資料不重複，而且會排序
        ts.add(2);
        ts.add(6);
        ts.add(4);
        ts.add(8);
        ts.add(2);
        ts.add(4);

        System.out.println(ts);
        ts.remove(4);
        System.out.println(ts);
        System.out.println(ts.size());        
    }
}
