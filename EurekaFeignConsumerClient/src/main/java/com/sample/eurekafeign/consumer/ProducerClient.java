package com.sample.eurekafeign.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("EurekaFeignProducerClient")
public interface ProducerClient {

	@RequestMapping(value="/getProducer/{name}", method=RequestMethod.GET)
	String getMethod(@PathVariable(value="name") String name);
	
	@RequestMapping(value="/postProducer/{name}", method=RequestMethod.POST)
	String postMethod(@PathVariable(value="name") String name);
}
