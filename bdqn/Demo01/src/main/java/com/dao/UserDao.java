package com.dao;

import com.pojo.Goods;
import com.pojo.RostRule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    public List queryUserByPage(@Param("m") int m, @Param("n") int n, @Param("ids") List ids, @Param("account") String account, @Param("nickName") String nickName);

}
