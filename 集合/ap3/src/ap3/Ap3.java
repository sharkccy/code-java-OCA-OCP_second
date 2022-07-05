package ap3;

import java.util.ArrayList;

public class Ap3 {

    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList();
        ar.add("aa");
        ar.add("cc");
        ar.add("bb");
        System.out.println(ar);

        ArrayList<Object> ar2 = new ArrayList();
        ar2.add(3);
        ar2.add("ee");
        ar2.add(3.5);
        ar2.add('@');
        System.out.println(ar2);
    }
}
