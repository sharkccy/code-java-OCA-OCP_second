package test19;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       TreeSet<Character> ts = new TreeSet<>();
       String first = sc.next();
       String second = sc.next();
       
       for(int i = 0; i < first.length()-1;i++){
           for(int j = 0; j < second.length()-1;j++){
               if(first.charAt(i) == second.charAt(j)){
                   ts.add(first.charAt(i));
               }
           }
       }
             
        Iterator it = ts.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println("");
    }
}
