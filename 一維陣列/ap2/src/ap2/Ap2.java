package ap2;

public class Ap2 {

    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {250 , 695 , 455 , 752 , 200};
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum = sum + arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\nsum = " + sum);
        System.out.println("average = " + sum * 1.0 / arr.length);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
//       for(int x :arr){
//           System.out.print(x + " ");
//       }
    }
}
