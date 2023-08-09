package com.madhavasoft.microservices.microservicesx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhavasoft.microservices.microservicesx.bean.Limits;
import com.madhavasoft.microservices.microservicesx.configuration.Configuration;

@RestController
public class MicroservicesXController {
	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		// return new Limits(1,1000);
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	}
}
