package com.bootdemo.com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public String greeting() {
		return "Hello World!,  I am comming...";
	}
}
