package com.instanceofcake.spring.compscan;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CompJDBCConnection {

	public CompJDBCConnection() {
		super();
		System.out.println("JDBCConnection---------");
	}
	
  

}
