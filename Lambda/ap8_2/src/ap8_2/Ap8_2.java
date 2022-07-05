package ap8_2;

import java.util.ArrayList;

public class Ap8_2 {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(5);
        ar.add(1);
        ar.add(6);
        ar.add(3);
        ar.add(4);

        for (int x : ar) {
            if (x > 3) {
                System.out.println(x + " ");
            }
        }
        System.out.println("");

        ar.stream()
                .filter(n -> n > 3)
                .forEach(n -> System.out.print(n + ""));

    }
}
