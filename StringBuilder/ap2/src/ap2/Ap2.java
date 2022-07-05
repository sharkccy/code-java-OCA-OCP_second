package ap2;

public class Ap2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Taiwan");
        sb.append("Go");
        System.out.println(sb);
        
        System.out.println(sb.length());
        
        String s = "TaiwanGo";
        System.out.println(sb.equals(s));           //sb為物件，直接跟字串比會是false
        System.out.println(sb.toString().equals(s));//轉字串再比
        
        sb.replace(0, sb.length(), "Japan");
        System.out.println(sb);
        
        sb.insert(0, "HI, ");       //可給起始值的增加
        System.out.println(sb);
    }
}
