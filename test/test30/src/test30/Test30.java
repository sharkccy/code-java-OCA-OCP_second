package test30;

public class Test30 {

    public static void main(String[] args) {
        int[] ar = {1, 1, 4, 4, 7, 7, 3, 6, 6, 8, 8, 5, 5 };
        for(int i = 1; i < ar.length-1;i++){
            if(ar[0] != ar[1]){
                System.out.println(ar[0]);
                break;
            }
            else if(ar[i-1] != ar[i] && ar[i] != ar[i+1]){
                System.out.println(ar[i]);
            }
            else if(ar[ar.length-1] != ar[ar.length-2]){
                System.out.println(ar[ar.length-1]);
                break;
            }
        }
    }
}
