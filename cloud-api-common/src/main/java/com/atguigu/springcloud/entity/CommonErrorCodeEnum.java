package com.atguigu.springcloud.entity;

/**
 * @author Running boy
 * @Description: 通用错误编码枚举类
 * @date 2020/5/30 8:20
 */
public enum CommonErrorCodeEnum {
    ;

    private Integer code;

    private String msg;

    CommonErrorCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
