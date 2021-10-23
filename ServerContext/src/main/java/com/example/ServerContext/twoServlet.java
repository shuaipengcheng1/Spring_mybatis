package com.example.ServerContext;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import sun.plugin.javascript.JSObject;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;


public class twoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//取出全局数据
        PrintWriter printWriter = response.getWriter();
        ServletContext application = request.getServletContext();
   Map<String,String> map = (Map<String,String>) application.getAttribute("user");
//  循环
      Set<Map.Entry<String,String>> set= map.entrySet();
        for (Map.Entry<String,String> item:set
             ) {
            System.out.println("key "+item.getKey()+" value "+item.getValue());


        }
//        输出Json格式字符串
        printWriter.write(JSONObject.toJSONString(application.getAttribute("user")));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
