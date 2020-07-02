package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DemoDao;
import com.example.demo.domain.Domain;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoDao dao;
	
	@Override
	public List<Domain> getUsers() {
		return dao.getUsers();
	}

}
