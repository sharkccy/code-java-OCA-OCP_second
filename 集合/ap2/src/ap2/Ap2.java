package ap2;

import java.util.ArrayList;

public class Ap2 {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(4);
        ar.add(1);
        ar.add(2);
        ar.add(5);
        ar.add(3);
        System.out.println(ar);
        ar.remove(3);
        System.out.println(ar);
    }
}
