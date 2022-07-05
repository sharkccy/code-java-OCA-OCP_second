package ap_test_into.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Ap_test_intoDB {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();        
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int sum = 0;
        String correct = "";
        System.out.println("請輸入英文名字:");
        String ename = sc.next();
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
                    for (int x : ts) {
                        if (x == no2) {
                            System.out.println(rs.getString("question"));
                            String en = sc.next();
                            if (en.equals(rs.getString("answer"))) {
                                sum += rs.getInt("score");
                                correct += rs.getInt("number") + ", ";//注意" "，不要放到索引內
                            }
                        }
                    }
                }
                System.out.println("得分 = " + sum);
                //寫入資料庫
                String s2 = "INSERT INTO math (name,score,no) VALUES (" + "'" + ename + "'," + "'" + sum + "'," + "'" + correct + "'"+")";
                st.execute(s2);
                //因為變數要讀入再轉字串，而SQL之字串需要單引號包起來，所以要用JAVA雙引號包SQL單引號
                con.close();                
            }
        } 
        catch (Exception e) {
            System.out.println("Error!!!");
        }
    }
}
