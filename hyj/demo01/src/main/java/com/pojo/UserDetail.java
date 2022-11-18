package com.pojo;

/**
 * @ClassName UserDetail
 * @Description TODO
 * @Author hyj98
 * @Date 2022-11-08 21:51
 * @Version 1.0
 */

public class UserDetail {

    //属性
    private int id;
    private String address;
    private String email;
    private String telphone;

    public UserDetail() {
    }

    public UserDetail(int id, String address, String email, String telphone) {
        this.id = id;
        this.address = address;
        this.email = email;
        this.telphone = telphone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
}
