package com.katarina.spring.entity;

/**
 * @author : LiuWeidong
 * @date : 2018/8/17.
 */
public class EntityTemplate {
    private String userName;
    private String passWord;

    public EntityTemplate() {
    }

    public EntityTemplate(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "EntityTemplate{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
