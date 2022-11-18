package com.test;

import com.dao.UserDao;
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

public class Test6 {

    public static void main(String[] args) throws IOException {

        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //创建连接
        SqlSession session = sqlSessionFactory.openSession();

        //模拟解析获取dao层对象:
        UserDao userDao = session.getMapper(UserDao.class);

        /*User u1 = userMapper.selectUser(6,"李白","444");
        System.out.println("用户为: " + u1.getAccount()+"---"+u1.getNick_name());*/

        /*List list = new ArrayList();
        list.add(2);
        list.add(4);
        list.add(6);
        List<User> userList = userMapper.selectUserByIds(list);
        System.out.println("用户列表为: "+userList);*/

        //查询所有
        /*List<User> userList = userMapper.selectAll();
        for (User u1 : userList) {
            System.out.println(u1.getAccount()+"---"+u1.getPassword());
        }*/


        User user = userDao.queryUser(2);
        System.out.println(user.getAccount()+"---"+user.getPassword()+"---"+user.getUserDetail().getAddress());

        //提交事务:
        session.commit();
        session.close();

    }
}
