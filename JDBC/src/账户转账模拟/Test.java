package 账户转账模拟;

import java.sql.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Map<String, String> map = GetName();
        Connection connection = null;
        int m = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "spc652324");
//                根据id修改钱
                String sql = "update Test set balance=? where actno=?";
                String sql1 = "SELECT * FROM Test where actno =?";
                connection.setAutoCommit(false);//改为手动提交
//                取值
                PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
                preparedStatement1.setInt(1, Integer.parseInt(map.get("no")));
                ResultSet resultSet = preparedStatement1.executeQuery();
//如果有值
                if (resultSet.next()) {
//    取出balance
                    m = resultSet.getInt("balance");
                    System.out.println("余额" + m);

                } else {
                    System.out.println("无账户");
                }

//                判断余额
                if (m - Integer.parseInt(map.get("balance")) > 0) {
//修改
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
//                    修改余额
                    preparedStatement.setInt(1, m - Integer.parseInt(map.get("balance")));
                    preparedStatement.setInt(2, Integer.parseInt(map.get("no")));
                    preparedStatement.executeUpdate();

                    //               查看现在余额
                    preparedStatement1 = connection.prepareStatement(sql1);
                    preparedStatement1.setInt(1, Integer.parseInt(map.get("no")));
                    resultSet = preparedStatement1.executeQuery();
//如果有值
                    if (resultSet.next()) {
//    取出balance
                        m = resultSet.getInt("balance");
                        System.out.println("取款成功 余额" + m);
                        connection.commit();
                    }
                } else {
                    System.out.println("存款不足");
                }


            } catch (SQLException throwables) {
                throwables.printStackTrace();
                //如果报错 就回滚
                if (connection != null) {
                    try {
                        connection.rollback();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, String> GetName() {
        Scanner scanner = new Scanner(System.in);
//        你的账户id
        String no = scanner.next();
//     你要取的钱
        String balance = scanner.next();

        Map<String, String> map = new TreeMap<>();
        map.put("no", no);
        map.put("balance", balance);
        return map;

    }
}
