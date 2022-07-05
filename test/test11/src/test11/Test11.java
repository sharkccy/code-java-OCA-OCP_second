package test11;

import java.util.Scanner;

public class Test11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        while (time-- != 0) {
            int no = sc.nextInt();
            int[] cmd = new int[no];
            int i, sum = 0;

            Scanner sc2 = new Scanner(System.in);
            for (i = 0; i < no; i++) {
                String s = sc2.nextLine();  // nextLine()以enter作為輸入的結束
                if (s.equals("LEFT")) {
                    cmd[i] = -1;
                } 
                else if (s.equals("RIGHT")) {
                    cmd[i] = 1;
                } 
                else {
                    cmd[i] = cmd[s.charAt(s.length() - 1) - '0' - 1];  //索引要減1，別忘了(指令第2個是索引1)
                }
            }
            for (int x : cmd) {
                sum = sum + x;
            }
            System.out.println(sum);              
        }

    }
}
