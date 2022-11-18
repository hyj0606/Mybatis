package com.dao;

import com.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//dao层接口类型:
public interface GoodsDao {

    //模拟部分功能:
    public Goods queryGoodsById();

    //提供功能:
    // 不同参数形式:

    //1.删除功能:   传入单个基本类型参数 ID
    public int delGoods(int id);

    //2.查询功能    传入两个基本类型参数ID.返回List集合
    public List<Goods> queryGoodsByIds(@Param("id1") int id1, @Param("id2") int id2);

    //3.新增功能:   传入1个对象类型参数Goods
    public int addGoods(Goods g1);

    //4.查询功能:   传入多个基本类型参数List ids. 返回List集合
    public List<Goods> queryGoodsByListIds(@Param("ids") List ids);

    //返回值封装: 封装集合结果
    public List<Goods> queryAllGoods();

}
