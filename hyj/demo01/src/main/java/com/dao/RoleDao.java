package com.dao;

import com.pojo.Role;
import org.apache.ibatis.annotations.Param;

public interface RoleDao {

    //一对多关联查询
    //方式一:
    public Role queryRole(@Param("id") int id);
    //方式二:
    public Role queryRole2(@Param("id") int id);


}
