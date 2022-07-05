package test29;

import java.util.Scanner;

public class Test29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){            
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            int[] no = new int[n];
            int sum = 0, max = 0;
            for (int i = 0; i < n; i++) {
                no[i] = sc.nextInt();
                if (sum + no[i] > 0) {
                    sum += no[i];
                    if (sum > max) {
                        max = sum;
                    }
                } 
                else {
                    sum = 0;
                }
            }
            if(max > 0){
                System.out.println("The maximum winning streak is " + sum);                
            }
            else{
                System.out.println("Losing streak.");
            }
        }
                 
    }
}
