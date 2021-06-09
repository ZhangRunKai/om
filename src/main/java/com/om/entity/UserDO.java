package com.om.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author zhang run kai
 * @version 1.0
 * @date 2021/6/9 21:12
 */
@Data
public class UserDO {

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
}
