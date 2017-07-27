package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by venkat on 27/07/17.
 */
@RestController
public class SampleController
{
	@Value("${message}")
	private String message;

	@RequestMapping("getrequest")
	public String getRequest() {
		return message;
	}
}
