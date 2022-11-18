package com.test;

import com.dao.RoleDao;
import com.dao.UserDao;
import com.pojo.Role;
import com.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author hyj98
 * @Date 2022-11-03 21:26
 * @Version 1.0
 */

public class Test8 {

    @Test
    public void test1() throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //创建连接
        SqlSession session = sqlSessionFactory.openSession();

        //模拟解析获取dao层对象:
        RoleDao roleDao = session.getMapper(RoleDao.class);
        Role role = roleDao.queryRole(1);
        System.out.println("角色对象为: "+role);

        //提交事务:
        session.commit();
        session.close();
    }

    @Test
    public void test2() throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //创建连接
        SqlSession session = sqlSessionFactory.openSession();

        //模拟解析获取dao层对象:
        RoleDao roleDao = session.getMapper(RoleDao.class);
        Role role = roleDao.queryRole(1);
        System.out.println("角色对象为: "+role);
        
        //提交事务:
        session.commit();
        session.close();
    }
}

