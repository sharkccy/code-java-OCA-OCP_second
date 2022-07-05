package ap4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class Ap4 {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("c:/java/oca.txt");
        DosFileAttributes da = Files.readAttributes(p, DosFileAttributes.class);
        System.out.println("Hidden: " + da.isHidden());   // 檔案是否隱藏
        System.out.println("是否是檔案：" + da.isArchive());   // 是否是檔案
        System.out.println("唯讀：" + da.isReadOnly());   // 檔案是否唯讀
        System.out.println("是否是系統檔：" + da.isSystem());   // 檔案是否是系統檔
    }
}

