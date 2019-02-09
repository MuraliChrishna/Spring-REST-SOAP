package com.krish.ws.soap.config;


import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.krish.ws.soap.HelloWs;

@Configuration
public class WebServiceConfig {
	@Autowired
	private Bus bus;
	
	public EndpointImpl endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, new HelloWs());
		endpoint.publish("/hello");
		return endpoint;
	}

	
}
