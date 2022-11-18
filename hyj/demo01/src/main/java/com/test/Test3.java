package com.test;

import com.dao.GoodsDao;
import com.pojo.Goods;
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

public class Test3 {

    public static void main(String[] args) throws IOException {

        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //创建连接
        SqlSession session = sqlSessionFactory.openSession();

        //模拟解析获取dao层对象:
        GoodsDao goodsDao = session.getMapper(GoodsDao.class);

        //调用dao层方法:
        Goods g1 = goodsDao.queryGoodsById();

        System.out.println("结果为: "+ g1.getId()+"--"+g1.getGoodsName()+"--"+g1.getGoodsPrice());

    }

}
