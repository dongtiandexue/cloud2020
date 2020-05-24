package com.atguigu.springcloud.service;

import com.atguigu.springcloud.pojo.Payment;

/**
 * @author Running boy
 * @Description: Payment 业务类
 * @date 2020/5/24 23:39
 */
public interface PaymentService {

    /**
     * 添加支付
     * @param payment
     * @return
     */
    Boolean add(Payment payment);

    /**
     * 根据id获取支付订单
     * @param id
     * @return
     */
    Payment getById(String id);
}
