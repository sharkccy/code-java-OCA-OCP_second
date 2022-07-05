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
public class Moto {
    public int a = 1;       // 任何位置皆可存取
    int b = 2;              // 同一個package可存取
    protected int c = 3;    // 子類別可存取
    private int d = 4;      // 同一個class可存取
}
