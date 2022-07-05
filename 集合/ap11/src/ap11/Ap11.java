package ap11;

import java.util.HashMap;
import java.util.TreeMap;

public class Ap11 {

    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "Adam");
        tm.put(5, "Frank");
        tm.put(2, "Legend");
        tm.put(1, "Howard");     //後面蓋掉前面的
        System.out.println(tm);
        System.out.println(tm.get(1));
        System.out.println(tm.containsKey(2));
        System.out.println(tm.containsValue("Legend"));
        System.out.println(tm.remove(1));
        System.out.println(tm);
    }
}
