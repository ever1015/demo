package com.test.springcloud.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.springcloud.dao.PaymentDao;
import com.test.springcloud.entities.Payment;
import com.test.springcloud.service.PaymentService;

@Service
public class PaymentserviceImpl implements PaymentService{

	@Resource
	private PaymentDao dao;

	@Override
	public int add(Payment payment) {
		return dao.add(payment);
	}

	@Override
	public Payment getPaymentById(Long id) {
		return dao.getPaymentById(id);
	}
	
	
}
