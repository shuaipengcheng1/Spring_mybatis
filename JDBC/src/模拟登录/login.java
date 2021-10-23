package 模拟登录;

import java.sql.*;

public class login implements Server {
    public login(String dataBase, String name, String password) {
        DataBase = dataBase;
        this.name = name;
        this.password = password;
    }

    String DataBase;
    String name;
    String password;

    public void login() {
//        登录
        Connection connection = null;
//        statement是不安全的 因为会被sql注入 我们要使用prepardStatement代替
//
//        Statement statement = null;
        PreparedStatement preparedStatement = null;

        ResultSet resultSet = null;
        try {
            //        注册组件

            Class.forName("com.mysql.cj.jdbc.Driver");
//            创建链接
            try {
                connection = DriverManager.getConnection(DataBase, "root", "spc652324");
//                statement = connection.createStatement();
//                开始预编译  传入一个sql语句的框架 ?为以后传入的值 通过预编译后 以后传入的值都会被认为是一个字符串 而不是一个sql语句
                preparedStatement = connection.prepareStatement("select * from user where user.name=? AND user.password=?"); //问号为占位符 用于标识传入的值为字符串 而不是一条sql语句 就可以避免sql注入

//给占位符?传值  调用实例化方法setString 还有setint .... 传值的是一个数组结构 第一个? 是 1 第二个是 2
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, password);
//查询   切记 不要传入sql语句
                resultSet  = preparedStatement.executeQuery();

//              查询
//                resultSet = statement.executeQuery("select * from user where user.name=\"" + name + "\" AND user.password=\"" + password + "\"");
//         resultSet = statement.executeQuery("select * from user where user.name=\"misaka\" AND user.password=\"spc652324\"");

//                开始查询 切记!!!! 如果使用preparedStatement切记不要再往excute方法传入sql语句 因为执行该函数 会再一次编译 就和statement一样了
//                resultSet = preparedStatement.executeQuery("select * from user where user.name=\"" + name + "\" AND user.password=\"" + password + "\"");

//            查询是否有对应值返回
                if (resultSet.next()) {

                    System.out.println("登录成功！");
                } else {
                    System.out.println("登录失败");
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
//                if (statement != null) {
//                    try {
//                        statement.close();
//                    } catch (SQLException throwables) {
//                        throwables.printStackTrace();
//                    }
//                }

                if (preparedStatement != null) {
                    try {
                        preparedStatement.close();
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
