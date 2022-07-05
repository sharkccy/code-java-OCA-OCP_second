package ap1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ap1 {

    public static void main(String[] args) {
        try {
            Path p = Paths.get("c:/java");
            Files.createDirectories(p);     //建立目錄
            System.out.println("目錄建立完成!!");
            Path p2 = Paths.get("c:/java/oca.txt");
            Files.createFile(p2);          //建立檔案      
            System.out.println("檔案建立完成!!");
        } 
        catch (IOException e) {
            System.out.println("目錄或檔案已經存在!!");
        }
    }
}
