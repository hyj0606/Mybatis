package com.pojo;

import java.util.List;

/**
 * @ClassName Role
 * @Description TODO
 * @Author hyj98
 * @Date 2022-11-08 23:12
 * @Version 1.0
 */

public class Role {
    private int id;
    private String roleName;

    //一对多
    private List<User> userList;

    public Role() {
    }

    public Role(int id, String roleName, List<User> userList) {
        this.id = id;
        this.roleName = roleName;
        this.userList = userList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
