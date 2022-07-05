/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_A;

/**
 *
 * @author student
 */
public class Car {
    void go(){  // 不加存取修飾子(public、private)，只有同一個package可以存取
        System.out.println("go");
    }
}
