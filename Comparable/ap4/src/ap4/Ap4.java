package ap4;

import java.util.ArrayList;
import java.util.Collections;

public class Ap4 {
    public static void main(String[] args) {
       Std s1 = new Std("Allen" , 88 , 70);
       Std s2 = new Std("Henry" , 48 , 97);
       Std s3 = new Std("Lucas" , 95 , 57);
       
       ArrayList<Std> ar = new ArrayList<>();
       ar.add(s1);
       ar.add(s2);
       ar.add(s3);
       
       Collections.sort(ar);
        System.out.println(ar);
    }
}

class Std implements Comparable<Std>{           //也要給Std物件
    String name;
    int java , c;

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
        if(this.name.compareTo(s.name) < 0){
            return -1;              // -1 表 以name做遞減排序(java規定之寫法，無為什麼)
        }
        else if(this.name.compareTo(s.name) > 0){
            return 1;               // 1 表 以name做遞增排序
        }
        else{
            return 0;
        }       
    }
    
    
}