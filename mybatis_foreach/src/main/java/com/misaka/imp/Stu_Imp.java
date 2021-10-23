package com.misaka.imp;

import com.misaka.dao.StudentDao;
import com.misaka.domain.Stu;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Stu_Imp implements StudentDao {
//    实现接口

    @Override
    public int Insert(Stu stu) {
//      创建一个sqlsession
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            动态代理
           StudentDao studentDao= sqlSessionFactoryBuilder.build(inputStream).openSession(true).getMapper(StudentDao.class);

 int re=    studentDao.Insert(stu); //返回值
//提交事务

            return re;
        } catch (IOException e) {
            e.printStackTrace();
        }
return 0;
    }

    @Override
    public List<Stu> SelectStu() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            动态代理
            StudentDao studentDao= sqlSessionFactoryBuilder.build(inputStream).openSession(true).getMapper(StudentDao.class);

            return    studentDao.SelectStu();
//提交事务


        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Stu> SelectList(List<Integer> list) {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            动态代理
            StudentDao studentDao= sqlSessionFactoryBuilder.build(inputStream).openSession(true).getMapper(StudentDao.class);

            return    studentDao.SelectList(list);
//提交事务


        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Stu> SelectList_Stu(List<Stu> list) {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            动态代理
            StudentDao studentDao= sqlSessionFactoryBuilder.build(inputStream).openSession(true).getMapper(StudentDao.class);

            return    studentDao.SelectList_Stu(list);
//提交事务


        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
