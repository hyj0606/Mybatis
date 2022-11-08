package com.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test1 {

    public static void main(String[] args) throws IOException {

//        测试代码: 演示数据库连接是否正常.
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建会话工厂对象:
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //根据工厂产生会话连接对象:
        SqlSession session = sqlSessionFactory.openSession();

        System.out.println("创建连接为: " + session);

    }

}
