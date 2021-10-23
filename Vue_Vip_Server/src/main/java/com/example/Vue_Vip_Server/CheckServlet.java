package com.example.Vue_Vip_Server;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CheckServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//   Get请求
        response.setCharacterEncoding("utf-8");

        response.setContentType("text/html;charset=utf-8");
        Map map = new HashMap();
        PrintWriter printWriter = response.getWriter();
        System.out.println("get");
//接收参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //     通过jdbc
        Connection connection = null;
        PreparedStatement update = null;

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vue_project", "root", "spc652324");
                preparedStatement = connection.prepareStatement("SELECT * from user WHERE user.name = ? And user.password=? ");
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
//                查找isVip  1为vip 0为普通用户
                    System.out.println(resultSet.getInt("isVip"));
                    if (resultSet.getInt("isVip") == 1) {

                    } else {
                        map.put("type", false);
                        map.put("message", "未获取vip记录");
                        printWriter.write(JSONObject.toJSONString(map));
                        return;
                    }
//                查找过期
                    System.out.println(resultSet.getString("passDate"));
                    String DBTIME = resultSet.getString("passDate");
//                获取现在日期
                    Date date = new Date();
                    long now = date.getTime();
//                    将数据库的时间转为date对象
                    Date date1 = null;
                    long db = 0;
                    try {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        date1 = simpleDateFormat.parse(DBTIME);
                        db = date1.getTime();

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    if (now <= db) {
//                        没过期
                        map.put("type", true);
                        map.put("message", "成功");
                        printWriter.write(JSONObject.toJSONString(map));
                    } else {
//                     过期
                        long l = now - db;

                        int days = (int) l / (1000 * 60 * 60 * 24);
                        System.out.println("两个时间之间的天数差为：" + days);

                        map.put("type", false);
                        map.put("message", "过期 ! vip已经离你而去" + days+" 天拉");
                        update = connection.prepareStatement("update user set user.isVip=?  WHERE user.name = ?");
//                        update.setInt(1, 0);
//                        update.setString(2, username);
//                        int i = update.executeUpdate();
//                        System.out.println(i == 1 ? "修改成功" : "失败");

                        printWriter.write(JSONObject.toJSONString(map));
                    }


                }else {
                    map.put("type", false);
                    map.put("message", "未登录?");
                    printWriter.write(JSONObject.toJSONString(map));
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
