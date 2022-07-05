package ap12;

import java.util.ArrayList;
import java.util.Scanner;

public class Ap12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList ar = new ArrayList();
        int no = sc.nextInt();  
        int no2 = no;
        while (no != 0) {           
            int a = no % 10;
            ar.add(0, a);
            no /= 10;
        }        
        ar.add(no2);
        System.out.println(ar);
    }
}
