package 类注册;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class 类注册 {

//    这种更常用
    public static void main(String[] args) {
        try {
            //        通过该类的静态代码块来实现注册 就不需要写 DriveManager.register()了

            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
//                直接获取链接对象
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vue_project","root","spc652324");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
