package com.test.springcloud.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.test.springcloud.entities.CommonResult;
import com.test.springcloud.entities.Payment;

import lombok.experimental.var;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class OrderController {

	public static final String PAYMENT_URL = "http://192.168.0.55:8001";
	
	@Resource
	private RestTemplate restTemplate;
	
	@GetMapping("/consumer/payment/add")
	public CommonResult<Payment> add(Payment payment) {
		return restTemplate.postForObject(PAYMENT_URL + "/payment/add", payment, CommonResult.class);
	}
	
	@GetMapping("/consumer/payment/get/{id}")
	public CommonResult<Payment> getPayment(@PathVariable Long id) {
		return restTemplate.getForObject(PAYMENT_URL + "/payment/get/"+id, CommonResult.class);
	}
	
}
