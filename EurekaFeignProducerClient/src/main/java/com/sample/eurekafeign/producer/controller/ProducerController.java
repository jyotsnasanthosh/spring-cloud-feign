package com.sample.eurekafeign.producer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

	@RequestMapping(value="/getProducer/{name}", method=RequestMethod.GET)
	public String getMethod(@PathVariable(value="name") String name) {
		return "GET method of Producer called with name "+name;
	}
	
	@RequestMapping(value="/postProducer/{name}", method=RequestMethod.POST)
	public String postMethod(@PathVariable(value="name") String name) {
		return "POST method of Producer called with name "+name;
	}
}
