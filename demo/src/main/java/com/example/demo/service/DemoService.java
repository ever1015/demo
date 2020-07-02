package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Domain;

public interface DemoService {

	List<Domain> getUsers();

	List<Domain> getUsers_mybatis();

}
