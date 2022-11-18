package com.test;

import com.dao.GoodsDao;
import com.pojo.Goods;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author hyj98
 * @Date 2022-11-03 21:26
 * @Version 1.0
 */

public class Test4 {

    public static void main(String[] args) throws IOException {

        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //创建连接
        SqlSession session = sqlSessionFactory.openSession();

        //模拟解析获取dao层对象:
        GoodsDao goodsDao = session.getMapper(GoodsDao.class);

        //调用dao层方法:
        //测试方法一:
        /*Goods goods = new Goods();
        goods.setGoodsName("冰箱");
        goods.setGoodsPrice("1234");
        goods.setType("1");
        int i = goodsDao.addGoods(goods);
        System.out.println("插入新数据为: "+i);*/

        //测试方法二:
        int i = goodsDao.delGoods(14);
        System.out.println("删除指定数据为: " + i);

        //测试方法三:
        /*List<Goods> goodsList = goodsDao.queryGoodsByIds(10,11);
        for (Goods g1 : goodsList) {
            System.out.println("数据为: " + g1.getGoodsName()+"---"+g1.getGoodsPrice());
        }*/

        //测试方法四:
        /*List list = new ArrayList();
        list.add(12);
        list.add(13);
        list.add(14);

        List<Goods> goodsList = goodsDao.queryGoodsByListIds(list);
        for (Goods g1 : goodsList) {
            System.out.println("数据为: " + g1.getGoodsName()+"---"+g1.getGoodsPrice());
        }*/

        //提交事务:
        session.commit();
        session.close();

    }
}
