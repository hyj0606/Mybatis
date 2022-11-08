package com.test;

import com.dao.GoodsDao;
import com.pojo.Goods;
import com.pojo.RostRule;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName Test4
 * @Description TODO
 * @Author hyj98
 * @Date 2022-11-07 11:00
 * @Version 1.0
 */

public class Test5 {
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

        //删除
        /*int i = goodsDao.delGoodsByIds(13, 24);
        System.out.println(i);*/

        //查询
        Goods goods = goodsDao.queryGoodsById(8, RostRule.DESC);
        System.out.println(goods.getGoodsName()+"---"+goods.getGoodsPrice());

        //手动提交事务
        session.commit();
        session.close();

    }
}
