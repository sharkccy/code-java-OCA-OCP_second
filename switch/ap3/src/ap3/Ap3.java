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
        int n = 6;
        switch (n) {    // n 的值可以是整數、小數、字串
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("aaa");
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                System.out.println("bbb");
                break;
            case 11:
            case 13:
                System.out.println("ccc");
                break;
            default:
                System.out.println("zzz");
        }
    }

}
