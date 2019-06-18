package com.instanceofcake.spring.springgarage.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JDBCConnection {

	public JDBCConnection() {
		super();
		System.out.println("JDBCConnection---------");
	}
	
  

}
