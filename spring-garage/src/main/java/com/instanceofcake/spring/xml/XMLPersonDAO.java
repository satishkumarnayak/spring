package com.instanceofcake.spring.xml;

public class XMLPersonDAO {

	XMLJDBCConnection connection;

	public XMLJDBCConnection getConnection() {
		return connection;
	}

	public void setConnection(XMLJDBCConnection connection) {
		this.connection = connection;
	}

}
