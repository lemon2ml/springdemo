package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.LeiProperties;

@RestController
public class HelloWorldController {
	@Value("${com.lei.title}")
	String ti;
	
//	List<User> userList = new ArrayList<User>();

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World.";
	}
	
//	@GetMapping("/users")
//	public List<User> getUsers() {
//		userList.add(new User("aa1", "aa@126.com", "aa", "aa123456","2018.1.1"));
//		return userList;
//	}

	@GetMapping("/lp")
	public String getLeiPros() {
		LeiProperties lp = new LeiProperties();
		String title = lp.getTitle();
		String des = lp.getDes();
		return "title: " + ti + ", des: " + des;
	}
}
