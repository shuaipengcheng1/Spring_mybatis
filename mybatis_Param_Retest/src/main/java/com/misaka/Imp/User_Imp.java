package com.misaka.Imp;

import com.misaka.dao.UserDao;
import com.misaka.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class User_Imp implements UserDao {
    @Override
    public List<User> SelectUser(User user) {
//        获取SqlSession
        try {
            InputStream inputStream  = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory= sqlSessionFactoryBuilder.build(inputStream);
     SqlSession session= sqlSessionFactory.openSession();
//     动态代理
    UserDao userDao= session.getMapper(UserDao.class);
 return userDao.SelectUser(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
