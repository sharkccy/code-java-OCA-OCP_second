package ap5;

public class Ap5 {
    public static void main(String[] args) {
       int num[] = {4 , 8 , 16 , 32 , 64 , 128 , 256 , 512};
       int data[] = {2 , 0 , 4 , 4 , 0 , 8};
       for(int i = 0 ; i < num.length; i++){
           try{
               System.out.println((num[i] + " / " + data[i] + " = " + num[i] / data[i]));
           }
           catch(ArithmeticException e){
               System.out.println("分母不可為零!!");
           }
           catch(IndexOutOfBoundsException e2){
               System.out.println("陣列長度不符!!");
           }
       }
    }
}
