package 删除操作;

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement = null;
        try{
            //注册

            Driver driver =null;
            driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
//            链接
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vue_project","root","spc652324");
//            获取可操作对象
           statement = connection.createStatement();
//            删除   TypeCode =1 成功 0 失败
         int TypeCode=   statement.executeUpdate("DELETE  FROM user where `user`.id = 14");

         System.out.println(TypeCode==1?"成功":"失败");

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }
    }
}
