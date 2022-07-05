package ap1;

public class Ap1 {
    public static void main(String[] args) {
       go();
       go("Germany");
       go(1);
       go("Korea" , "Japan");
    }
    
    public static void go(){
        System.out.println("Go to Taiwan");
    }
    
    public static void go(String des){
        System.out.println("Go to " + des);
    }
    
    public static void go(int a){
        System.out.println("Go to the USA");
    }
    
    public static void go(String s1 , String s2){
        System.out.println("Go to " + s1 + ", and " + s2);
    }
    
//    public static void go(int x){ 錯
//        System.out.println("Go to Thailand");
//    }
    
//    public static String go(){ 錯
//        return "Go to China";
//    }
}
