package ap7;

import java.util.ArrayList;
import java.util.Arrays;

public class Ap7 {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(5);
        ar.add(2);
        ar.add(1);
        ar.add(3);
        ar.add(4);
        System.out.println(ar);
        
        
        Integer[] num = {22 , 44 , 66}; //int 為變數，Integer 為類別 所以要宣告一致
        ArrayList<Integer> ar2 = new ArrayList<>(Arrays.asList(num));
        
        String[] std = {"Daniel" , "Leo" , "Jason" , "Mark"};
        ArrayList<String> ar3 = new ArrayList<>(Arrays.asList(std));
        System.out.println(ar3);
        
    }
}
