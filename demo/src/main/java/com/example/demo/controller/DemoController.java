package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.BaseDTO;
import com.example.demo.domain.Domain;
import com.example.demo.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private DemoService service;
	
	@GetMapping("/getUsers")
    public List<Domain>  user (){
        return service.getUsers();
    }
	
	@GetMapping("/getUsers_mybatis")
    public List<Domain>  getUsers_mybatis (){
        return service.getUsers_mybatis();
    }
	
	@GetMapping("/getUsers_mybatis2")
    public List<Domain>  getUsers_mybatis2 (){
        return service.getUsers_mybatis2();
    }
	@GetMapping("/geredisVal")
    public List<Domain>  geredisVal (){
        return service.geredisVal();
    }
	@GetMapping("/uploadString")
    public BaseDTO  uploadString (String content){
        return service.uploadString(content);
    }
}
