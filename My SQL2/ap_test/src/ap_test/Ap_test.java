package ap_test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Ap_test {

    public static void main(String[] args) throws IOException {
        TreeSet<Integer> ts = new TreeSet<>();
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/score.txt" , true));
        Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("y/M/d HH/m");  //年月日 時(24)分
        Scanner sc = new Scanner(System.in);
        Random r = new Random();      
        int sum = 0;
        String correct = "";
        while (ts.size() < 3) {
            int no = r.nextInt(10) + 1;    //產生1~10之亂數，且不重複
            ts.add(no);
        }

        while (ts.size() < 5) {
            int no = r.nextInt(5) + 11;    //產生11~15之亂數，且不重複
            ts.add(no);
        }       

        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/test2";
            String user = "root";
            String passwd = "1234";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, passwd);

            if (con != null && !con.isClosed()) {
                System.out.println("資料庫連線成功！");
                Statement st = con.createStatement();
                String s = "SELECT * FROM exam";
                ResultSet rs = st.executeQuery(s);
                while (rs.next()) {
                    int no2 = rs.getInt("number");
                    for(int x : ts){
                        if(x == no2){
                            System.out.println(rs.getString("question"));
                            String en = sc.next();
                            if(en.equals(rs.getString("answer"))){
                                sum += rs.getInt("score");
                                correct += rs.getInt("number") + " " ;//注意" "，不要放到索引內
                            }
                        }
                    }
                }
                bw.write("答對題號: " + correct + "   " + "總分: " +sum + "   ");
                String str = sf.format(d);
                bw.write(str);
                bw.newLine();
                bw.close();
                con.close();
                System.out.println("得分 = " + sum);
            }
        } 
        catch (Exception e) {
            System.out.println("Error!!!");
        }
    }
}
