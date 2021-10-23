package com.misaka.imp;

import com.misaka.dao.UserDao;
import com.misaka.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class User_imp implements UserDao {
    @Override
    public List<User> SelectUser() {
//        获取sqlsession
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder  = new SqlSessionFactoryBuilder();
           UserDao userDao= sqlSessionFactoryBuilder.build(inputStream).openSession().getMapper(UserDao.class);
        return userDao.SelectUser();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
