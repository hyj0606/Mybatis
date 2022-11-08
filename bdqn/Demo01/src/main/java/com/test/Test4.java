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
 * @ClassName Test4
 * @Description TODO
 * @Author hyj98
 * @Date 2022-11-07 11:00
 * @Version 1.0
 */

public class Test4 {
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
        GoodsDao goodsDao = session.getMapper(GoodsDao.class);

        //根据对象党法操作数据库
        System.out.println("对象为: "+goodsDao);

        //查询
        /*int id = 3;
        Goods goods = goodsDao.queryGoodsById(id);
        System.out.println(goods.getGoodsName()+"---"+goods.getGoodsPrice());*/

        //加入
        /*Goods g1 = new Goods(0,"酒鬼花生",15);
        int i = goodsDao.addGoods(g1);
        System.out.println(i);*/

        //删除
        /*List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        int i = goodsDao.delGoodsByIdList(list);
        System.out.println(i);*/

        //手动提交事务
        session.commit();
        session.close();

    }
}
