/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= 0 && x <= 50) {
            if (x % 2 != 0) {
                System.out.println("a");
            } 
            else if (x % 2 == 0) {
                System.out.println("A");
            } 
            else {
                System.out.println("錯誤");
            }
        } 
        else if (x > 50 && x <= 100) {
            if (x % 2 != 0) {
                System.out.println("b");
            } 
            else if (x % 2 == 0) {
                System.out.println("B");
            } 
            else {
                System.out.println("錯誤");
            }
        } 
        else {
            System.out.println("錯誤");
        }
    }

}
