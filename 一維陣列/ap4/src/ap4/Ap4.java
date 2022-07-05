package ap4;

public class Ap4 {
    public static void main(String[] args) {
       int[] arr1 = {1,2,3,4};
       int[] arr2 = arr1;   // arr2 參照到 arr1(陣列仍然只有一個，但有另一個別名：arr2)
       
       for(int x : arr2){
           System.out.print(x + " ");
       }
        System.out.println("");
       
       arr2[1] = 5;
       for(int y : arr1){
           System.out.print(y + " ");
       }
        System.out.println("");
       
       arr2 = new int[5];
       for(int z : arr2){
           System.out.print(z + " ");
       }
    }
}
