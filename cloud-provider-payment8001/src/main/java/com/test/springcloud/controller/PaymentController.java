package com.test.springcloud.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springcloud.entities.Payment;
import com.test.springcloud.entities.CommonResult;
import com.test.springcloud.service.PaymentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PaymentController {

	@Resource
	private PaymentService paymentService;
	
	@PostMapping(value = "/payment/add")
	public CommonResult<Payment> add(Payment payment){
		int result = paymentService.add(payment);
		log.info("********插入结果:" + result);
		if(result > 0) {
			return new CommonResult(200, "插入成功",result);
		}else {
			return new CommonResult(200, "插入失败",null);
		}
	}
	@GetMapping(value = "/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id")Long id){
		Payment result = paymentService.getPaymentById(id);
		log.info("********查询结果:" + result);
		if(result != null) {
			return new CommonResult(200, "查询成功",result);
		}else {
			return new CommonResult(200, "查询失败，id=" + id,null);
		}
	}
}
