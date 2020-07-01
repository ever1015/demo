package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoService;

@RestController
public class DemoController {

	@Autowired
	private DemoService service;
	
	@GetMapping("/user")
    public String  user (){
        return "hi  I'am ever";
    }
}
