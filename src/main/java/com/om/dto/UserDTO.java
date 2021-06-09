package com.om.dto;

import org.springframework.util.DigestUtils;

import java.util.Date;

/**
 * @author zhang run kai
 * @version 1.0
 * @date 2021/6/9 23:23
 */
public class UserDTO {

    private Integer storeId;

    private Integer userId;

    private String userName;

    private String userAccount;

    private String userPassword;

    private String userPhone;

    private Date registerTime;

    private Date updateTime;

    private Date loginTime;

    /**
     * todo -1:废弃，1:正常
     */
    private Integer userStatus;

    /**
     * 积分
     */
    private Integer userIntegral;

    private Integer roleId;

    /**
     * 角色权限
     */
    private Integer rolePower;

    /**
     * 角色详情
     */
    private Integer roleDetail;


    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

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

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }


    public String getUserPassword() {
        String base = this.userPassword + "/" + "helloWorld";
        return DigestUtils.md5DigestAsHex(base.getBytes());
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getUserIntegral() {
        return userIntegral;
    }

    public void setUserIntegral(Integer userIntegral) {
        this.userIntegral = userIntegral;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getRolePower() {
        return rolePower;
    }

    public void setRolePower(Integer rolePower) {
        this.rolePower = rolePower;
    }

    public Integer getRoleDetail() {
        return roleDetail;
    }

    public void setRoleDetail(Integer roleDetail) {
        this.roleDetail = roleDetail;
    }
}
