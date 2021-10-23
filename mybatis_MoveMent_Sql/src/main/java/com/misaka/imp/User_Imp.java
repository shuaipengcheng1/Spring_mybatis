package com.misaka.imp;

import com.misaka.dao.UserDao;
import com.misaka.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class User_Imp implements UserDao {
    @Override
    public List<User> SelectUser(int id) {
//        创建一个sqlsession
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
          SqlSessionFactory sqlSessionFactory= sqlSessionFactoryBuilder.build(inputStream);
       UserDao userDao=   sqlSessionFactory.openSession().getMapper(UserDao.class);
       return userDao.SelectUser(id);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
