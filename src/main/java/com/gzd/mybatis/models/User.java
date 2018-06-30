package com.gzd.mybatis.models;

/**
 * @author gzd
 * @create 2018-06-29 14:59
 * @desc
 **/
public class User {

    private int id;
    private String name;
    private String dept;
    private String phone;
    private String website;

    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString(){

        return "name={"+name+"}" + " id = {"+id+"}";
    }
}