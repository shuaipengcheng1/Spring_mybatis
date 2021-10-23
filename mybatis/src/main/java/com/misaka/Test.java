package com.misaka;


import com.misaka.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        访问mybatis读取User数据
//        定义mybatis主配置文件的名称 从类路径的根开始（target/class开始）
        String config  = "mybatis.xml";
        try {
            //        读取config标识的文件
            InputStream inputStream= Resources.getResourceAsStream(config);

          //创建SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//           // 创建SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory  = sqlSessionFactoryBuilder.build(inputStream);
//            获取sqlsession对象
            SqlSession session = sqlSessionFactory.openSession();
//            指定sql语句的标识 sql映射文件的namespace属性+"."+标签id值
String sqlId = "com.misaka.dao.UserDao."+"SelectUser";
//执行sql语句 通过sqlId
         List<User> list= session.selectList(sqlId);
         list.forEach(user -> {System.out.println(user);});
//       关闭对象
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
