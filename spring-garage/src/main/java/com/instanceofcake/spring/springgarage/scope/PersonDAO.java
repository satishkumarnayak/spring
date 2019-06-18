package com.instanceofcake.spring.springgarage.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
	
	@Autowired
	JDBCConnection connection;

	public JDBCConnection getConnection() {
		return connection;
	}

	public void setConnection(JDBCConnection connection) {
		this.connection = connection;
	}
	
	

}
