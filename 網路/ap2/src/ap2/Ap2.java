package ap2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Ap2 {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL u = new URL("https://www.pcschool.com.tw/courses?branchid=FB");
        InputStreamReader is = new  InputStreamReader(u.openStream());
        BufferedReader br = new BufferedReader(is);
        String s;
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/net.txt"));
       
        while ((s = br.readLine()) != null) {
           System.out.println(s);
           bw.write(s);
           bw.newLine();
        }
        bw.close();
        br.close(); 
        is.close();
    }
}
