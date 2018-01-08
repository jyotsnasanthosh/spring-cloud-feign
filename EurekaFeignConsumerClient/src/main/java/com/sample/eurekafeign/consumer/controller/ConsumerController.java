package com.sample.eurekafeign.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.eurekafeign.consumer.ProducerClient;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

	@Autowired
	private ProducerClient producerClient;
	
	@RequestMapping(value="/get/{name}", method=RequestMethod.GET)
	public String getMethod(@PathVariable(value="name") String name) {
		return producerClient.getMethod(name);
	}
	
	@RequestMapping(value="/post/{name}", method=RequestMethod.POST)
	public String postMethod(@PathVariable(value="name") String name) {
		return producerClient.postMethod(name);
	}
}
