package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DemoDao;
import com.example.demo.dao.DemoMapper;
import com.example.demo.domain.BaseDTO;
import com.example.demo.domain.Domain;
import com.example.demo.util.JedisUtil;
import com.example.demo.util.OSSUtil;

import redis.clients.jedis.Jedis;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoDao dao;
	@Autowired
	private DemoMapper mapper;
	@Autowired
	private JedisUtil jedis;
	@Autowired
	private OSSUtil oss;
	
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

	@Override
	public List<Domain> geredisVal() {
		jedis.set("1", "小白");
		String val = jedis.get("1");
		Domain d = new Domain();
		d.setId(1L);
		d.setName(val);
		List<Domain> list = new ArrayList<>();
		list.add(d);
		return list;
	}

	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost",6379);
		jedis.auth("123456");
		System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        jedis.close();
	}
	//需要测试
	@Override
	public BaseDTO uploadString(String content) {
		BaseDTO dto = oss.uploadString(content, "/test", "/test", "femgmox");
		return dto;
	}
}
