package 处理返回结果;

import java.sql.*;
import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
//        注册驱动
//        获取链接
//        获取数据库操作对象
//        执行sql语句
//        处理结果
//        释放资源
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;  //结果集
        try {
//            注册组件
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vue_project", "root", "spc652324");
                statement = connection.createStatement();

                resultSet = statement.executeQuery("select * from user where user.name=\"misaka\"");
                System.out.println(resultSet);
//                和集合一样 有一个
        while (resultSet.next()){
//            getString()方法的特点是 不论数据库中的值为什么类型 始终取值为String数据类型
            System.out.println(resultSet.getString("icon")); //获取该列的值
//            getString(int ColumNo) or getString(string name)    可以传入列数 或者 指定的列名

//            并且还有getInt getDouble getChar ....

        }

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
