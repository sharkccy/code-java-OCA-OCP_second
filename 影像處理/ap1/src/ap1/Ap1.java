package ap1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Ap1 {

    public static void main(String[] args) {
        try {
            File f = new File("src/lena.jpg");
            BufferedImage bi = ImageIO.read(f);
            int w = bi.getWidth();
            int h = bi.getHeight();
            for(int i = 0 ; i < w; i++){
                for(int j = 0 ; j < h; j++){
                    int p = bi.getRGB(i, j);        //抓出每個pixel的RGB(24bits)
                    int r = (p >> 16) & 0xff;//取出每個pixel的紅色值，0x為16進位，0xff為2進位的11111111
                    int g = (p >> 8) & 0xff;//取出每個pixel的綠色值，跟0xff 做 & 可刪掉前方之紅色(0前方位元會自動補0，&後即消失)
                    int b =  p & 0xff;//取出每個pixel的藍色值，跟0xff 做 & 可刪掉前方之紅、綠色
                    int avg = (r + b + g)/3;
                    p = (avg << 16)|(avg << 8)|avg;//將三個8位元(rgb之平均值)接回24位元，自己位移後跟自己做|可直接將自己填到後方位數
                    bi.setRGB(i, j, p);
                }
            }
            f = new File("src/lena2.jpg");
            ImageIO.write(bi, "jpg", f);
        } 
        catch (IOException e) {
            System.out.println("檔案開啟錯誤!");
        }
    }
}
