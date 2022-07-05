package javaapplication1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaApplication1 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("src/data.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/data2.txt"));
            String s ;
            while((s = br.readLine()) != null){
               Pattern p = Pattern.compile("劉德華");
               Matcher m = p.matcher(s);
               if(m.find()){
                   s = s.replaceAll("劉德華", "Andy");                                    
               }   
               bw.write(s); 
               bw.newLine();
            }
            br.close();
            bw.flush();
            bw.close();
            System.out.println("存檔完畢!!");
        }
       catch(FileNotFoundException e){
           System.out.println("找不到檔案!");
       }
        catch(IOException e2){
            System.out.println("檔案讀取錯誤!");
        }        
    }
}
