package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.BaseDTO;
import com.example.demo.domain.Domain;

public interface DemoService {

	List<Domain> getUsers();

	List<Domain> getUsers_mybatis();

	List<Domain> getUsers_mybatis2();

	List<Domain> geredisVal();

	BaseDTO uploadString(String content);

}
