package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DemoDao;
import com.example.demo.dao.DemoMapper;
import com.example.demo.domain.Domain;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoDao dao;
	@Autowired
	private DemoMapper mapper;
	
	@Override
	public List<Domain> getUsers() {
		return dao.getUsers();
	}

	@Override
	public List<Domain> getUsers_mybatis() {
		return mapper.getUsers_mybatis();
	}

	@Override
	public List<Domain> getUsers_mybatis2() {
		return mapper.getUsers_mybatis2();
	}

}
