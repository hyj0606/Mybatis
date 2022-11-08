package com.test;

import com.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName Test3
 * @Description TODO
 * @Author hyj98
 * @Date 2022-11-07 9:58
 * @Version 1.0
 */

public class Test3 {

    public static void main(String[] args) throws IOException {

        //1.加载sqlMapConfig.xml核心配置文件
        String location = "SqlMapConfig.xml";
        /*InputStream is = new FileInputStream(location);*/
        InputStream is = Resources.getResourceAsStream(location);

        //2.创建连接
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build( is );

        SqlSession session = factory.openSession();

        //3.获取sql操作执行
        /*User o = (User)session.selectOne("UserMapper.queryUserById");

        System.out.println("解析用户为: "+o.getAccount()+"---"+o.getNickName());*/

        int insert = session.insert("UserMapper.addUser");

        int update = session.update("UserMapper.editUser");

        int delete = session.delete("UserMapper.delUser");

        System.out.println(insert+"---"+update+"---"+delete);

        //事务手动提交
        session.commit();
        session.close();

    }
}
