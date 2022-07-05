package ap5;

public class Ap5 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int tmp;
        //=== 陣列反轉程式碼 =======
        for (int i = 0; i < arr.length / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        //==========================
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
