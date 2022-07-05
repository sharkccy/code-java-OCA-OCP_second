package ap3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ap3 {

    public static void main(String[] args) {
        try {
            Path p = Paths.get("c:/java/oca.txt");
            Files.setAttribute(p, "dos:readonly", true);        //唯讀
            Files.setAttribute(p, "dos:hidden", true);         //隱藏
            Files.setAttribute(p, "dos:system", true);          //系統檔
            System.out.println("ok");
        }
        catch(IOException e){
            System.out.println("找不到路徑!");
        }
    }
}
