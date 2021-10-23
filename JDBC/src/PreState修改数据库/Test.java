package PreState修改数据库;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
//        注册
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            创建运行对象
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vue_project", "root", "spc652324");
//                预编译

//                插入数据
//                PreparedStatement preparedStatement = connection.prepareStatement("insert into user (user.name,user.password) values (?,?)");
//                更新数据
                PreparedStatement preparedStatement = connection.prepareStatement("update user set user.name=?,user.password=? where user.id=59");
//填值
                preparedStatement.setString(1, "l");
                preparedStatement.setString(2, "spc6524");
                int key = preparedStatement.executeUpdate();
                System.out.println(key == 1 ? "插入成功" : "失败");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
