package JDBC工具;

import java.sql.*;

public class Test {
    //    JDBC工具类 简化jdbc编程
//    工具类当中的构造方法一般都是私有的 因为不需要new对象
//    方法为静态方法
    private Test() {

    }

    static {
        try {
//            静态代码块再类加载执行 并且只执行一次
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection(String url, String user, String password) throws  Exception{


            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;

    }
    public static void close(Connection connection, Statement statement, ResultSet resultSet){
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}


