package com.example.Vue_Vip_Server;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import com.alibaba.fastjson.JSONObject;

import java.util.*;
import java.util.Date;

public class VipServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//Vip类
        PrintWriter printWriter = response.getWriter();

//     response.setHeader("Access-Control-Allow-Origin","http://localhost:3000");
        response.setHeader("Access-Control-Allow-Credentials","true");
        System.out.println("get");
//接收参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String Day = request.getParameter("Day");
        System.out.println("" + username + password + Day);
//     通过jdbc
//        Connection connection = null;

//        从全局作用域获取
        Connection connection = (Connection) request.getServletContext().getAttribute("connection");
        ResultSet resultSet = null;

        PreparedStatement preparedStatement = null;
        PreparedStatement update = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vue_project", "root", "spc652324");
                preparedStatement = connection.prepareStatement("SELECT * FROM user where user.name=? And user.password=?");
                update = connection.prepareStatement("update user set user.isVip=? , user.passDate =? WHERE user.name = ?");

                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
//           有数据
//           修改数据
                    update.setInt(1, 1);
//           计算日期
                    Calendar cal = Calendar.getInstance();//使用默认时区和语言环境获得一个日历。

//           cal.add(Calendar.DAY_OF_MONTH, -1);//取当前日期的前一天.

                    cal.add(Calendar.DAY_OF_MONTH, +Integer.parseInt(Day));//取当前日期的后n天.
//通过格式化输出日期
                    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

                    update.setString(2, format.format(cal.getTime()));
                    update.setString(3, username);

                    System.out.println("xx");
                    int i = update.executeUpdate();
                    System.out.println(i == 1 ? "修改成功" : "失败");
                    Map<String, Boolean> map = new HashMap<>();
                    if (i == 1) {
                        map.put("type", true);
                        printWriter.write(JSONObject.toJSONString(map));
                    } else {
                        map.put("type", false);
                        printWriter.write(JSONObject.toJSONString(map));
                    }
                } else {
                    System.out.println("错误");
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
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
