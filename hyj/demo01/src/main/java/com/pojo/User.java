package com.pojo;

/**
 * @ClassName User
 * @Description TODO
 * @Author hyj98
 * @Date 2022-11-03 21:37
 * @Version 1.0
 */

public class User {
    //当前用户信息
    private int id;
    private String password;
    private String account;
    private String nick_name;

    //关联一对一的用户详细信息对象
    private UserDetail userDetail;

    public User() {
    }

    public User(int id, String password, String account, String nick_name, UserDetail userDetail) {
        this.id = id;
        this.password = password;
        this.account = account;
        this.nick_name = nick_name;
        this.userDetail = userDetail;
    }

    public User(int id, String password, String account, String nick_name) {
        this.id = id;
        this.password = password;
        this.account = account;
        this.nick_name = nick_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }
}
