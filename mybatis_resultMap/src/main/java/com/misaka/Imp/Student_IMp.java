package com.misaka.Imp;

import com.misaka.dao.StudentDao;
import com.misaka.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Student_IMp implements StudentDao {
    @Override
    public List<Student> SelectStudent() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            StudentDao studentDao = session.getMapper(StudentDao.class);
            return studentDao.SelectStudent();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
