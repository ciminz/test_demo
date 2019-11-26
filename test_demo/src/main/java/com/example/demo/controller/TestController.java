package com.example.demo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/getInfo")
	public String getInfo(HttpServletRequest request) {
		String username = request.getParameter("username");
		System.out.println("=======>" + username);
		return username;
	}
}
