package com.yep.creater.model;

/**
 *
 */
public class User {
    private Integer userId;
    private String userName;
    private String userPwd;
    private Integer iState;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getiState() {
        return iState;
    }

    public void setiState(Integer iState) {
        this.iState = iState;
    }
}
