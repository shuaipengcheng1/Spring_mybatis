package com.misaka.Imp;

import com.misaka.dao.UserDao;
import com.misaka.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class User_Imp implements UserDao {
//    实现类
String config = "mybatis.xml";
    @Override
    public int Insert(User user) {
//        读取
        try {
            InputStream inputStream = Resources.getResourceAsStream(config);
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
          SqlSessionFactory sqlSessionFactory= sqlSessionFactoryBuilder.build(inputStream);
        SqlSession session= sqlSessionFactory.openSession();
//        动态代理 自动判断方法使用 Insert 或者是 SelectList ...
//            动态代理 就是调用该接口方法 然后自动去UserDAO.XML文件中 寻找nanespace为接口名的mapper 再寻找id为调用方法的sql映射
         UserDao userDao =   session.getMapper(UserDao.class);
        int i= userDao.Insert(user);
        session.commit(); //提交事务
        System.out.println(i+"行受到影响");
        session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }
}
