package test17;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Test17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList();
        int no = sc.nextInt();
        for (int i = 0; i < no; i++) {
            ar.add(sc.nextInt());
        }
        TreeSet<Integer> tr = new TreeSet();
        for (int i = 0; i < ar.size(); i++) {
            for(int j = i ; j < ar.size();j++){
                int plus = ar.get(i) + ar.get(j);
                tr.add(plus);
            }
        }
        
        if(tr.size() == (1 + ar.size()) * ar.size() / 2){
            System.out.println("It is a B2-Sequence.");
        }
        else{
            System.out.println("It is not a B2-Sequence.");
        } 
        System.out.println((1 + ar.size()) * ar.size() / 2);
        System.out.println(tr.size());
    }
}
