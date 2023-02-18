package com.example.modulefront.apps.controller;

import com.example.modulefront.apps.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UsersController {

	private final UsersService usersService;


	@PostMapping("/save")
	public void test() {
		usersService.test();
	}

	@GetMapping("/find")
	public void test2() {
		usersService.test2();
	}

}
