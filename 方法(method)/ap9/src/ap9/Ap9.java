package ap9;

public class Ap9 {

    public static void main(String[] args) {
        sum();
        sum(2);
        sum(2, 3);
        sum(2, 3, 4);
        sum(2, 3, 4, 5);
    }

    public static void sum(int... a) {       //不定參數，視其為陣列
        int s = 0;
        for (int n : a) {
            s += n;
        }
        System.out.println(s);                
    }
    public static void add(int... a){
        int s = 0;
        for(int i = 0; i < a.length;i++){
            s += a[i];            
        }
        System.out.println(s);
    } 
}
