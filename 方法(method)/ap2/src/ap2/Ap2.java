/*
輸出為何?
 */
package ap2;

public class Ap2 {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        add(arr);
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void add(int[] a) {       //int[] a = arr;
        int i;
        a = new int[5];                     //解除參照
        for (i = 0; i < a.length; i++) {
            a[i] = a[i] + 2;
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}