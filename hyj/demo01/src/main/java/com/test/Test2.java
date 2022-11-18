package com.test;

import com.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author hyj98
 * @Date 2022-11-03 21:26
 * @Version 1.0
 */

public class Test2 {

    public static void main(String[] args) throws IOException {

        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //创建连接
        SqlSession session = sqlSessionFactory.openSession();

        //测试其中的sql:
        User result = (User)session.selectOne("com.dao.UserDao.selectUser");
        System.out.println("结果为: "+result.getId()+"--"+result.getAccount()+"--"+result.getNick_name());

        //测试查询所有:
        List<User> userList = session.selectList( "com.dao.UserDao.selectAll");
        System.out.println("集合长度: "+userList.size());
        for (User u1 : userList) {
            System.out.println(u1.getId()+"--"+u1.getAccount());
        }

        //其他增删改操作
        int insert1 = session.insert("com.dao.UserDao.addUser");
        int insert2 = session.delete("com.dao.UserDao.delUser");
        int insert3 = session.update("com.dao.UserDao.editUser");

        System.out.println(insert1+"--"+insert2+"--"+insert3);

        //事务提交:
        session.commit();

        session.close();

    }

}
