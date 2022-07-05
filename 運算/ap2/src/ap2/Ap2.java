/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap2;

/**
 *
 * @author student
 */
public class Ap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 2;
        System.out.println("a = " + a);
        System.out.println("a++ = " + (a++));   // 先取a值使用，使用後再 + 1
        System.out.println("a = " + a);
        
        int b = 2;
        System.out.println("b = " + b);
        System.out.println("++b = " + (++b));   // 先取b值 + 1再使用
        System.out.println("b = " + b);        
        
        a = 2;
        b = 2;
        System.out.println(a++ + ++b + a);
    }
    
}
