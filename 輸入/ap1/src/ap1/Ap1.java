/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap1;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Ap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入名字 :");        
        String name = sc.next();
        System.out.println("請輸入整數 :");
        int no = sc.nextInt();
        System.out.println(name + "您好，數字的平方為" + no * no);                        
    }
    
}
