package com.example.jsp;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class ResServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String re = "hello";
//        获取输出流
        PrintWriter printWriter = response.getWriter();
//   获取数据库
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        Map<String, String> peple = new HashMap<>();
        //            注册
        try {
//            try {
//                System.out.println(new com.mysql.cj.jdbc.Driver());
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

//            获取链接对象
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vue_project","root","spc652324");
//                查询
            preparedStatement = connection.prepareStatement("select * from user where user.name like ?");
//            模糊查询
            preparedStatement.setString(1, "m%");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet);
                peple.put(resultSet.getString("id"), resultSet.getString("name"));
            }
            //     写入响应体
            printWriter.write(JSONObject.toJSONString(peple));


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
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
