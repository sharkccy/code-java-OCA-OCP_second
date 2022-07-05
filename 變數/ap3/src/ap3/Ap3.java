/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap3;

/**
 *
 * @author student
 */
public class Ap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 111_111_111_1;
        int b = 1111_1111_11;
        
        int c = 0B1010_0101_11;  // 0B表示2進位
        int d = 0b1011;
        System.out.println(d);
        
        int e = 0167;           // 0開頭表示8進位
        System.out.println(e);
        int f = 0x2A3C;         // 0x開頭表示8進位
        System.out.println(f);
    }
    
}
