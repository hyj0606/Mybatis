package com.test;

import com.dao.GoodsDao;
import com.pojo.Goods;
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

public class Test5 {

    public static void main(String[] args) throws IOException {

        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //创建连接
        SqlSession session = sqlSessionFactory.openSession();

        //模拟解析获取dao层对象:
        GoodsDao goodsDao = session.getMapper(GoodsDao.class);

        //调用dao层方法: 演示返回值为基本类型,对象类型,集合类型
        List<Goods> goodsList = goodsDao.queryAllGoods();
        for (Goods g1 :
                goodsList) {
            System.out.println("数据为: "+ g1.getGoodsName()+"---"+g1.getGoodsPrice());
        }

        //提交事务:
        session.commit();
        session.close();

    }
}
