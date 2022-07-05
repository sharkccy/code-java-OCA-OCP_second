package javaapplication3;

public class JavaApplication3 {
    public static void main(String[] args) {
        int i = 2;
        int t = 0;
        
        while(i < 50){
            do
                i += 2;
            while(i <= 30);
            t++;
        }    
        System.out.println(i);
        System.out.println("t = " + t);
    }
}
