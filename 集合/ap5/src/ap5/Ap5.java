package ap5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ap5 {
    public static void main(String[] args) {
       List<Integer> ar = new ArrayList();
       int a[] = {327 * 509 * 12, 325*508*7 , 65*65*65*5, 753*27*329};
       Arrays.sort(a);
       for(int n : a){
           System.out.print(n + " ");
       }
        System.out.println("\n==============================");
        ar.add(4);
        ar.add(1);
        ar.add(2);
        ar.add(5);
        ar.add(3);
        Collections.sort(ar);
        System.out.println(ar);
    }
}
