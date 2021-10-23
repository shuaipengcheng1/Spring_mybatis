package com.misaka.Util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Mybatis_Util {
//    mybatis 的 工具类 获取Sqlsession对象

    //    config : mybatis配置文件名
//
    public static  SqlSession Get_Session(String config) throws Exception {
//        读取主文件
        InputStream inputStream = Resources.getResourceAsStream(config);
//   创建SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//        返回没有自动提交的Sqlsession;
        return sqlSessionFactory.openSession();
    }
}
