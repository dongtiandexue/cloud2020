package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.pojo.CommonResult;
import com.atguigu.springcloud.pojo.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Running boy
 * @Description: Payment 控制类
 * @date 2020/5/24 23:48
 */
@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("payment/create")
    public CommonResult create(@RequestBody Payment payment){
        paymentService.add(payment);
        return CommonResult.success();
    }

    @GetMapping("payment/get/{id}")
    public CommonResult getById(@PathVariable("id") String id ){
        return CommonResult.success(paymentService.getById(id));
    }
}
