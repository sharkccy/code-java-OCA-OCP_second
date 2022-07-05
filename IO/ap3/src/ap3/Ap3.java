package ap3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ap3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/data.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/score.txt" , true));
            Date d = new Date();             
            DateFormat df = DateFormat.getInstance();
            String m;
            String data[];
            int score = 0;
            while ((m = br.readLine()) != null) {
                data = m.split(",");
                System.out.println(data[1]);
                String ans = sc.next();
                if(ans.equals(data[2])){
                   score += 20;
                   bw.write(data[0] + " ");
                }                
            }
            bw.write(score + " ");
            bw.write(df.format(d) + " ");
            bw.newLine();
            System.out.println("score = " + score);
            br.close();
            bw.flush();
            bw.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("找不到檔案!");
        } 
        catch (IOException e2) {
            System.out.println("檔案讀取錯誤!!");
        }
    }
}
