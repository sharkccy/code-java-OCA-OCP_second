package test27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();                           //不要放到外面去，會結束不了
            if (n == 0) {
                break;
            } else {
                Number[] num = new Number[n];                //產生n個位子的物件陣列                
                for (int i = 0; i < n; i++) {
                    String s = sc.next();
                    num[i] = new Number(s);
                }
                ArrayList<Number> ar = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    ar.add(num[i]);
                }
                Collections.sort(ar);               //將數字排成最大的排序
                for (int i = 0; i < n; i++) {
                    System.out.print(ar.get(i).n);     //一一輸出每個ar(Number物件)的n值
                }
                System.out.println("");
            }
        }
    }
}

class Number implements Comparable<Number> {     //注意C大寫

    String n;

    public Number(String n) {
        this.n = n;     //輸入之數字
    }

    public int compareTo(Number nb) {
        if ((this.n + nb.n).compareTo((nb.n + this.n)) > 0) {
            return -1;
        } 
//        else if ((this.n + nb.n).compareTo((nb.n + this.n)) < 0) {        //取出最小的排法
//            return 1;
//       } 
        else {
            return 0;
        }
    }

}
