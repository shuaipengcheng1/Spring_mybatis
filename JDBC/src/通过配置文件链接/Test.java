package 通过配置文件链接;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Test {
    public static void main(String[] args) {
//        获取配置文件
      ResourceBundle resourceBundle = ResourceBundle.getBundle("通过配置文件链接.DATABASE-CONFIG");
        try {
//            通过静态代码块注册Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
//                获取链接对象
                Connection connection = DriverManager.getConnection(   resourceBundle.getString("database"),   resourceBundle.getString("user"),   resourceBundle.getString("password"));
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
