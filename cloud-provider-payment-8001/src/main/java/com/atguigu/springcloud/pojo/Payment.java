package com.atguigu.springcloud.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * @author Running boy
 * @Description: Payment 实体类
 * @date 2020/5/24 22:59
 */
@Data
public class Payment implements Serializable {
    /**
     * ID
     */
    private Long id;

    private String serial;

    private static final long serialVersionUID = 1L;
}