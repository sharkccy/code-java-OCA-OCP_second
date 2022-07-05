package ap1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ap1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("src/data.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();
        fr.close();
    }
}
