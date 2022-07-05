package ap3;

import java.util.ArrayList;
import java.util.Collections;

public class Ap3 {

    public static void main(String[] args) {
        Std s1 = new Std("Allen", 88, 70);
        Std s2 = new Std("Henry", 48, 97);
        Std s3 = new Std("Lucas", 88, 57);

        ArrayList<Std> ar = new ArrayList<>();
        ar.add(s1);
        ar.add(s2);
        ar.add(s3);

        Collections.sort(ar);
        System.out.println(ar);
    }
}

class Std implements Comparable<Std> {           //也要給Std物件

    String name;
    int java, c;

    public Std(String name, int java, int c) {
        this.name = name;
        this.java = java;
        this.c = c;
    }

    @Override
    public String toString() {
        return "name=" + name + ", java=" + java + ", c=" + c;
    }

    @Override                       //上方實作也要給Std物件
    public int compareTo(Std s) {
        if (this.java > s.java) {
            return -1;              //回傳-1表 以java成績做遞減排序  (如果較大，則大排到小)
        } 
//        else if (this.java < s.java) {
//            return 1;               //回傳1表 以java成績做遞增排序    (如果較小，則小排到大)
//        } 
//        else if (this.c > s.c) {
//            return 1;           //再以 c 高低分排
//        }
        else {
            return 0;
        }

    }

}
