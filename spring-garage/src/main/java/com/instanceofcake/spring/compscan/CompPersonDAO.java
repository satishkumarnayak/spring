package com.instanceofcake.spring.compscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompPersonDAO {
	
	@Autowired
	CompJDBCConnection connection;

	public CompJDBCConnection getConnection() {
		return connection;
	}

	public void setConnection(CompJDBCConnection connection) {
		this.connection = connection;
	}
	
	

}
