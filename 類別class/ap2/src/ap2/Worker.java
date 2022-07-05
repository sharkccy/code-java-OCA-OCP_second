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
public class Worker {

    String name;
    double level;
    int day = 22;

    public void info() {
        System.out.println("姓名: " + name + "職等: " + level);
    }

    public void salary() {
        double money = level * day * 1400;
        System.out.println("薪資: " + money);
    }

    public void salary(int bonus) {         //方法多載(overloading)
        double money = level * day * 1400 + bonus;
        System.out.println("薪資: " + money);
    }
}
