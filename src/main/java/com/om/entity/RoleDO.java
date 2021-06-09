package com.om.entity;

import lombok.Data;

/**
 * @author zhang run kai
 * @version 1.0
 * @date 2021/6/9 21:13
 */
@Data
public class RoleDO {

    /**
     * 店铺ID
     */
    private Integer storeId;
    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 角色名称
     */
    private Integer roleName;

    /**
     * 角色权限
     */
    private Integer rolePower;

    /**
     * 角色详情
     */
    private Integer roleDetail;

    /**
     * 当前角色的人数
     */
    private Integer userNum;
}
