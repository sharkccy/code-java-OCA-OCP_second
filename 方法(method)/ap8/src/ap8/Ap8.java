package ap8;
//質數判斷
import java.util.Scanner;

public class Ap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a = prime(sc.nextInt());
        System.out.println(a);
    }
    
    public static int prime(int a){
        for(int i = 2; i < Math.sqrt(a); i++){
            if(a % i == 0){
                return -1;
            }            
        }   
         return 1;
    }   
}
