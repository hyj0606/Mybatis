package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    public User selectUser(@Param("id") int id, @Param("account") String account, @Param("password") String password);

    public List<User> selectUserByIds(@Param("ids") List ids);

    public List<User> selectAll();

    public int addUser(@Param("u1")User u1);

    public int delUser(User user);

    public int editUser(@Param("u1")User u1);

    //一对一关联查询:
    //方式一:
    public User queryUser(@Param("id") int id);

    //方式二:
    public User queryUser2(@Param("id") int id);

}
