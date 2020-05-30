package com.atguigu.springcloud.entity;

/**
 * @author Running boy
 * @Description: 通用结果类
 * @date 2020/5/30 8:15
 */
public class CommonResult<T> {

    private Integer code;

    private String msg;

    private T data;

    public CommonResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public CommonResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
