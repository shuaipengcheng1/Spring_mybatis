package com.misaka;


import com.misaka.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String config = "mybatis.xml";
        try {
            //        读取

            InputStream inputStream = Resources.getResourceAsStream(config);
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory session = sqlSessionFactoryBuilder.build(inputStream);
            SqlSession session1 = session.openSession();
//            namespace + . + id
            List<User> list = session1.selectList("com.misaka.domain.User." + "SelectUser");
            list.forEach(user -> {
                System.out.println(user);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
