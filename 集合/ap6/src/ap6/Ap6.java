package ap6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ap6 {
    public static void main(String[] args) {
       List<Integer> ar = new ArrayList();  //εδΈθ½ε
        ar.add(4);
        ar.add(1);
        ar.add(2);
        ar.add(5);
        ar.add(3);
        System.out.println(Collections.max(ar));
        System.out.println(Collections.min(ar));
    }
}
