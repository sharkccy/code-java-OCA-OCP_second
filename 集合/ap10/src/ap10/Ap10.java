package ap10;

import java.util.Iterator;
import java.util.TreeSet;

public class Ap10 {
    public static void main(String[] args) {
       TreeSet<Integer> ts = new TreeSet<>();
       ts.add(5);
       ts.add(2);
       ts.add(1);
       ts.add(4);
       ts.add(3);
        System.out.println(ts);
        
        for(Integer n : ts){            //int 也可
            System.out.print(n + " ");
        }
        System.out.println("");
        
        Iterator it = ts.iterator();        //常用寫法
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println("");
    }
}
