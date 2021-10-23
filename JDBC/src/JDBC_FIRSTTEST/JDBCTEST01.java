package JDBC_FIRSTTEST;


import java.sql.*;

public class JDBCTEST01 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {

            //       1 注册驱动
//        创建driver对象
            Driver driver = null;
            driver = new com.mysql.cj.jdbc.Driver();
            //        注册
            DriverManager.registerDriver(driver);


//       2 获取链接
//        链接数据库 会返回一个可操作链接对象
//                                                  url   jdbc:mysql://服务器域名:端口/数据库            用户名      密码
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vue_project", "root", "spc652324");

//       3 获取数据库操作对象
//        创建一个Statement对象 用于获取数据库文件
            statement = connection.createStatement();

//       4 执行sql语句
            boolean type = statement.execute("SELECT * FROM  user where user.name=\"misaka\"");
            System.out.println(type);
//       5 处理查询结果


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            //       6 释放资源

            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();

                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


    }
}
