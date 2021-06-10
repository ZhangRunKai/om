package com.om.util;

import lombok.Data;

/**
 * @author zhang run kai
 * @version 1.0
 * @date 2021/6/10 21:19
 */
public enum ResultEnum {
    success(200,"请求成功"),
    paramError(2001,"参数错误"),
    parmMiss(2002,"缺失必要参数");

    ResultEnum(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    private Integer status;
    private String message;

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
