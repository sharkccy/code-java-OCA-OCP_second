package ap2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ap2 {
    public static void main(String[] args) {
       try{
            FileReader fr = new FileReader("src/data.txt");
            char[] ch = new char[50];
            fr.read(ch);
            
//            String s = new String(ch);  // 將字元陣列轉成字串
//            System.out.println(s);

            System.out.println(new String(ch)); //使用匿名物件
            fr.close();
        }
        
        
       catch(FileNotFoundException e){
           System.out.println("檔案開啟失敗");
       }
        catch(IOException e2){
           System.out.println("檔案讀取失敗");
       }
    }
}
