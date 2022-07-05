package ap4;

import java.util.ArrayList;
import java.util.List;

public class Ap4 {

    public static void main(String[] args) {
        List<Integer> ar = new ArrayList();  //向上轉型
        ar.add(4);
        ar.add(1);
        ar.add(2);
        ar.add(5);
        ar.add(3);
        System.out.println(ar);
    }
}
