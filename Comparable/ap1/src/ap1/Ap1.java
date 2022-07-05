package ap1;

import java.util.ArrayList;
import java.util.Collections;

public class Ap1 {
    public static void main(String[] args) {
       ArrayList<Integer> ar = new ArrayList<>();
       ar.add(3);
       ar.add(2);
       ar.add(4);
       ar.add(1);       
        System.out.println(ar);
      
       Collections.sort(ar);
       System.out.println(ar);
    }
}
