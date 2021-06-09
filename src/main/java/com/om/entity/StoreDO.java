package com.om.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author zhang run kai
 * @version 1.0
 * @date 2021/6/9 23:07
 */
@Data
public class StoreDO {

    private Integer storeId;

    private String storeName;

    private String storeDetail;

    private Integer province;

    private Integer city;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 店铺状态
     * todo -1：废弃；0：可使用；1：筹备中
     */
    private Integer storeStatus;

    private Date createTime;

    private Date updateTime;

    /**
     * 当前未结价订单
     */
    private Integer useOrder;

    /**
     * 订单总数
     */
    private Integer allOrder;

    /**
     * 店铺员工数量
     */
    private Integer userNum;

    /**
     * 店铺客户数量
     */
    private Integer customerNum;
}
