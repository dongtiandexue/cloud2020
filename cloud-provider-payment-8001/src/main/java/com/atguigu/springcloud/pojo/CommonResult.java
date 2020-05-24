package com.atguigu.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Running boy
 * @Description: 通用返回实体类
 * @date 2020/5/24 22:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;

    private String msg;

    private T data;

    public CommonResult(Integer code, String msg) {
        this(code, msg, null);
    }

    public static CommonResult success(){
        return new CommonResult(200,"操作成功！");
    }

    public static CommonResult success(Object data){
        return new CommonResult(200,"操作成功！",data);
    }

    public static CommonResult fail(){
        return new CommonResult(500,"操作失败！");
    }

}
