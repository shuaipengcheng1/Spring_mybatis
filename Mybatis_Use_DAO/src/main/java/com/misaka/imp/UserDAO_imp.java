package com.misaka.imp;

import com.misaka.dao.UserDao;
import com.misaka.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDAO_imp implements UserDao {
//    实现类


    //    实现插入方法
    @Override
    public int Insert() {
        String config = "mybatis.xml";
        int re=0;
        try {
            InputStream inputStream = Resources.getResourceAsStream(config);
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
//        插入s
          re=  session.insert("com.misaka.domain.User." + "InsertUser", new User("mi", "s"));
            session.commit(); //提交事务
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return re;
    }

    //    实现UserDao的方法 用于直接调用
    @Override
    public List<User> SelectUser() {
//        链接mybatis
        String config = "mybatis.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(config);
//            创建Sql
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            List<User> list = session.selectList("com.misaka.domain.User." + "selectUser");
//            返回结果
            return list;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
