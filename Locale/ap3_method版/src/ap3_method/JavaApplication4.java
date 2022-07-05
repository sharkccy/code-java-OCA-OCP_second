package ap3_method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) throws IOException {                
        Scanner sc = new Scanner(System.in);//可存成csv後資料分析
        System.out.println("Please choose(請選擇)：1. 中文  2.English：");
        int num = sc.nextInt();
        if (num == 1) {
            Locale tw = new Locale("zh", "TW");
            ResourceBundle rb = ResourceBundle.getBundle("data", tw);
            show(rb);
        }
        if (num == 2) {
            Locale usL = new Locale("en", "US");
            ResourceBundle rb2 = ResourceBundle.getBundle("data", usL);
            show(rb2);
        }
    }

    public static void show(ResourceBundle rb) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/out.txt" , true));        
        Scanner sc = new Scanner(System.in);
        int no = 5;
        int en[] = new int[no];
        int ans[] = {1, 2, 3, 4, 5};
        int sum = 0;
        String right = "";
        for (int i = 0; i < no; i++) {
            System.out.print(rb.getString(i + 1 + ""));
            
            en[i] = sc.nextInt();
            if (en[i] == ans[i]) {
                sum += 20;    
                right += en[i] + " ";
            }            
        }
        System.out.println(rb.getString("6") + sum);   
        bw.write("答對題號 : " + right);
        bw.newLine();
        bw.write("sum = " + sum);        
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
