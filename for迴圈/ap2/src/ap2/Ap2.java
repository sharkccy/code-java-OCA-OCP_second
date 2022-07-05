package ap2;

public class Ap2 {
    public static void main(String[] args) {
       int i , count = 0;
        System.out.println("在1到200中是13倍數的為:");
       for(i = 1;i <= 200;i++){
           if(i % 13 == 0){
               System.out.print(i + " ");
               count++;
           }
       }
        System.out.println("\n共有:" + count + "個");
    }
}
