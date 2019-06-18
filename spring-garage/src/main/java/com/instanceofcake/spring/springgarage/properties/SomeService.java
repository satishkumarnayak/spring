package com.instanceofcake.spring.springgarage.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeService {
	
	@Value("${someservice.url}")
	private String url;

	public String getUrl() {
		return url;
	}
	
	

}
