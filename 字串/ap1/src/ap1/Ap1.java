package ap1;

public class Ap1 {

    public static void main(String[] args) {
        String s1 = "happy";
        String s2 = "hap";
        String s3 = "happy";
        System.out.println(s1.length());    // 輸出字串的長度
        
        System.out.println(s1.charAt(1));   // 輸出字串的第2個字元(索引從0開始)
        
        System.out.println(s1.equals(s2));  // 回傳布林值(true/false)
        
        System.out.println(s2.compareTo(s3));   // 回傳整數。0表示相同，非0表示不同
    }
}
