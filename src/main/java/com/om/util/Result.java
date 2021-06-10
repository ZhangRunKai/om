package com.om.util;

import lombok.Data;

/**
 * @author zhang run kai
 * @version 1.0
 * @date 2021/6/10 21:16
 */
@Data
public class Result {

    private Integer status;
    private String message;
    private Object data;

    public static Result fail(ResultEnum resultEnum) {
        return new Result(resultEnum,null);
    }

    public static Result success(Object data){
        return new Result(ResultEnum.success,data);
    }

    public Result(ResultEnum resultEnum, Object data){
        this.status = resultEnum.getStatus();
        this.message = resultEnum.getMessage();
        this.data = data;
    }
    public Result(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
