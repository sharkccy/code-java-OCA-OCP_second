package ap2;

public class Ap2 {

    public static void main(String[] args) {
        int sum = 0 , count = 0;
        double avg = 0;
        int[][] arr = {{23, 80, 56, 14, 78, 60, 55},
                      {36, 27, 88, 49, 26, 40, 11},
                      {51, 72, 58, 29, 76, 43, 15}};
        for(int[] x : arr){
            for(int y : x){
                sum = sum + y ;
                count += 1;
            }            
        }
        avg = sum * 1.0 / count;
        System.out.println("avg = " + avg);
        
        for(int[] x : arr){
            for(int y : x){
                if(y > avg){
                    System.out.print(1 + " ");
                }
                else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }                
    }
}
