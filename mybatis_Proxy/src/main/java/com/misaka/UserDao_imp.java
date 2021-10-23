package com.misaka;

import com.misaka.dao.UserDao;
import com.misaka.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDao_imp implements UserDao {
    @Override
    public List<User> SelectUser() {
        String config = "mybatis.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(config);
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
         SqlSessionFactory sqlSessionFactory =  sqlSessionFactoryBuilder.build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
//            使用动态代理
         UserDao userDao=   session.getMapper(UserDao.class);
      return   userDao.SelectUser();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
