package ap5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ap5 {
    public static void main(String[] args) {
       Path p = Paths.get("c:/java/oca.txt");                  
       System.out.format("FileName: %s%n", p.getFileName()); // %s表示String，%n 表示換行       
       System.out.printf("FileName: %s\n", p.getFileName());        
       System.out.format("ParentDir: %s%n", p.getParent());       
       System.out.format("NameCount: %d%n", p.getNameCount());       
       System.out.format("Root: %s%n", p.getRoot());       
       System.out.format("isAbsolute: %b%n", p.isAbsolute()); // 絕對路徑要從磁碟機代號開始 C:\file       
       System.out.format("AbsolutePath: %s%n", p.toAbsolutePath());       
       System.out.format("URI: %s%n", p.toUri());  // Uniform resource indicator(統一資源定指器) (file:///)
       System.out.format("Path:%s, exits: %b%n", p, Files.exists(p));  // b% 表示布
    }
}
