package ap2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Ap2 {

    public static void main(String[] args) {
        Path p1 = Paths.get("c:/tmp/work");
        Path p2 = Paths.get("c:/tmp/data/game");
        Path p3 = Paths.get("c:/mov/asia");
        Path p4 = Paths.get("c:/code");
        
        System.out.println(p1.relativize(p4));     //從p1 走到 p4
        
        System.out.println(p1.relativize(p3));
        
        System.out.println(p2.relativize(p3));
    }
}
