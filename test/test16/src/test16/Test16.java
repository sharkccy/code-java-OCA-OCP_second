package test16;

import java.util.ArrayList;
import java.util.Scanner;

public class Test16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入人數: ");
        int people = sc.nextInt();
        System.out.println("請輸入報數間隔: ");
        int no = sc.nextInt();
        int index = 0;
        ArrayList<Integer> ar = new ArrayList();
        for (int i = 1; i <= people; i++) {
            ar.add(i);
        }
        while(!ar.isEmpty()){
            index = (index + no - 1) % ar.size();
            System.out.print(ar.get(index) + " ");
            ar.remove(ar.get(index));
        }
        System.out.println("");
    }
}
