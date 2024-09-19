package io.mlungu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

	private final Logger logger = LoggerFactory.getLogger(HealthController.class);

	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/health")
	public String health() {
		return "OK";
	}

}
