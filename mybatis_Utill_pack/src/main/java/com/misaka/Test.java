package com.misaka;

import com.misaka.Util.Mybatis_Util;
import com.misaka.domain.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {
    public static void main(String[] args) {
//        使用工具类
        try {
         SqlSession session= Mybatis_Util.Get_Session("mybatis.xml");
         //创建sqlID nameSpace+ . + id
            String sqlId ="com.misaka.domain.User."+"SelectUser";
      List<User> list= session.selectList(sqlId);
//         循环
            list.forEach(user -> {System.out.println(user);});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
