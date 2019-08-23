package com.yangyi.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yangyi.entity.UserEntity;
import com.yangyi.service.IUserService;

@RestController
public class TestController {

	@Autowired
	private IUserService ius;

	@PostMapping("/test")
	public UserEntity test(@RequestParam("value") String value) {
		return ius.getName(value);
	}

}
