package Statement使用场景;

import java.sql.*;
import java.util.Scanner;

public class Test {
//    业务 获取用户输入值 desc降序 asc升序 这里就需要用到asql注入
public static void main(String[] args) {
    Scanner scanner  = new Scanner(System.in);
    String key=  scanner.next();
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vue_project","root","spc652324");
//        这里就不能使用preStatement
          Statement statement= connection.createStatement();
//          sql注入
       ResultSet resultSet= statement.executeQuery("select name from user order by id "+key); //通过id降序或者升序
       while (resultSet.next()){
           System.out.println(resultSet.getString("name"));
       }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
}
}
