package ap1;

public class Ap1 {

    public static void main(String[] args) {
        int[][] a1 = new int[2][3];
        int[] a2[] = new int[2][3];
        int a3[][] = new int[2][3];

        int a4[][] = new int[2][];
        a4[0] = new int[3];
        a4[1] = new int[4];  //不規則之陣列 上3下4

        int a5[][] = {{1, 2, 3}, {7, 8, 9,10}};

        for (int i = 0; i < a5.length; i++) {           // arr.length可以取出陣列的列數 (2)
            for (int j = 0; j < a5[i].length; j++) {        // arr[i].length可以取出第i列的欄數 (4)
                System.out.print(a5[i][j] + "\t");
            }
            System.out.println();
        }
        
        
        System.out.println("======================================================");
        
        for(int[] x : a5){          // x 參照 arr
            for(int y : x){
                System.out.print(y + "\t");
            }
            System.out.println();
        }
    }
}
