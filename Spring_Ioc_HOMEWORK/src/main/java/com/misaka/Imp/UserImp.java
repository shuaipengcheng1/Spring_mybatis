package com.misaka.Imp;


import com.misaka.dao.UserDao;
import com.misaka.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//通过注解标记对象
@Repository(value = "user")
public class UserImp implements UserDao {
//    实现类

    @Override
    public List<User> SelectUser() {
//        获取SqlSesssion
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
         return    sqlSessionFactoryBuilder.build(inputStream).openSession().getMapper(UserDao.class).SelectUser();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
