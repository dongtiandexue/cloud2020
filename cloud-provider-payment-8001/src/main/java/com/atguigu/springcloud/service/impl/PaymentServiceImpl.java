package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.pojo.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;
import org.springframework.util.NumberUtils;

import javax.annotation.Resource;

/**
 * @author Running boy
 * @Description: Payment 业务实现类
 * @date 2020/5/24 23:41
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    PaymentDao paymentDao;

    @Override
    public Boolean add(Payment payment) {
        paymentDao.insert(payment);
        return true;
    }

    @Override
    public Payment getById(String id) {
        return paymentDao.selectByPrimaryKey(NumberUtils.parseNumber(id, Long.class));
    }
}
