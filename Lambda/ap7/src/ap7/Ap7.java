package ap7;

import java.util.ArrayList;

public class Ap7 {
    public static void main(String[] args) {
       ArrayList<Integer>  ar = new ArrayList<>();
       ar.add(5);
       ar.add(1);
       ar.add(6);
       ar.add(3);
       
       for(int x :ar){
           System.out.println(x + " ");
       }
        System.out.println("");
        
        ar.forEach(i -> System.out.println(i + " "));
        
        
    }
}
