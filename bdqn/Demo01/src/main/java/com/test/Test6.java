package com.test;

import com.dao.GoodsDao;
import com.dao.UserDao;
import com.pojo.Goods;
import com.pojo.RostRule;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test4
 * @Description TODO
 * @Author hyj98
 * @Date 2022-11-07 11:00
 * @Version 1.0
 */

public class Test6 {
    public static void main(String[] args) throws IOException {

        //测试: 解析dao层的接口类型对象:

        //1.加载sqlMapConfig.xml核心配置文件
        String location = "SqlMapConfig.xml";
        /*InputStream is = new FileInputStream(location);*/
        InputStream is = Resources.getResourceAsStream(location);

        //2.创建连接
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build( is );

        SqlSession session = factory.openSession();

        //先解析
        UserDao userDao = session.getMapper(UserDao.class);

        int m = 0;
        int n = 5;
        List list = new ArrayList();
        list.add(2);
        list.add(4);
        list.add(6);

        String account = "lisi";

        String nickName = "四";

        List userList = userDao.queryUserByPage(m, n, list, null, null);

        System.out.println(userList.size());

    }
}
