package com.dao;

import com.pojo.Goods;
import com.pojo.RostRule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDao {

    // 参数1: 基本数据类型
    public Goods queryGoodsById( @Param("id") int id,@Param("r1") RostRule r1 );

    // 参数2: 引用对象类型参数
    public int addGoods( Goods g1 );

    // 参数3: 数组或结合
    public int delGoodsByIdList(@Param("ids") List<Object> ids);

    // 集合4: 多个参数
    public int delGoodsByIds(@Param("id1") int id1,@Param("id2") int id2);

}
