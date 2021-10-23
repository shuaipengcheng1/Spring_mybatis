package com.misaka;

import com.misaka.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) {
//        读取
        String config = "mybatis.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(config);
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
          SqlSessionFactory sqlSessionFactory= sqlSessionFactoryBuilder.build(inputStream);
       SqlSession session= sqlSessionFactory.openSession();
    int i=   session.insert("com.misaka.domain.User."+"Insert",new User("mi","spc")); //插入要插入的值
  System.out.println(i);
//  mybatis 不会自动提交事务 所以插入无效 要手动提交事务
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
