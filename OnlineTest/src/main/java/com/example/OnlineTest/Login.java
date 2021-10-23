package com.example.OnlineTest;


import com.alibaba.fastjson.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Method", "*");

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//接收参数

        System.out.println("p");
//       跨域
//
        /* 允许跨域的主机地址 */
        response.setHeader("Access-Control-Allow-Origin", "*");
        /* 允许跨域的请求方法GET, POST, HEAD 等 */
        response.setHeader("Access-Control-Allow-Methods", "*");
        /* 重新预检验跨域的缓存时间 (s) */
        response.setHeader("Access-Control-Max-Age", "3600");
        /* 允许跨域的请求头 */
        response.setHeader("Access-Control-Allow-Headers", "*");
        /* 是否携带cookie */
        response.setHeader("Access-Control-Allow-Credentials", "true");


//     res.header("Access-Control-Allow-Origin", req.headers.origin); //需要显示设置来源
//     res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
//     res.header("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");
//     res.header("Access-Control-Allow-Credentials", true); //带cookies7     res.header("Content-Type", "application/json;charset=utf-8");

//        获取响应流
        PrintWriter printWriter = response.getWriter();


//        String username = request

//        通过request.getReader()
        BufferedReader bufferedReader = request.getReader();


//        发来的是一个json字符串 (bu)并且传入一个
        User user = JSONObject.parseObject(bufferedReader.readLine(), User.class);
        String password = user.password;
        String username = user.username;


//        判断登录状态
        Map<String, Boolean> map = new HashMap();

        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
//     查询是否有账号
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/在线考试管理系统", "root", "spc652324");
                preparedStatement = connection.prepareStatement("select * from user WHERE user.username=? And user.password= ?");
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
//                获取响应
                resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
//               有数据
                    map.put("type", true);
//                    返回json格式字符串
                    printWriter.write(JSONObject.toJSONString(map));
                } else {
                    //                    返回json格式字符串

                    map.put("type", false);
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
