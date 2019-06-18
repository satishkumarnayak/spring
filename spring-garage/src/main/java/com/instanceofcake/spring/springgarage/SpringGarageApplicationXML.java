package com.instanceofcake.spring.springgarage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.instanceofcake.spring.springgarage.basic.BinarySearchImpl;
import com.instanceofcake.spring.xml.XMLJDBCConnection;
import com.instanceofcake.spring.xml.XMLPersonDAO;


public class SpringGarageApplicationXML {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {

			String[] beanDefinitionNames = context.getBeanDefinitionNames();
			for (String bean : beanDefinitionNames) {
				System.out.println(bean);
			}
			XMLPersonDAO personbean = context.getBean(XMLPersonDAO.class);
			XMLJDBCConnection connectionbean = personbean.getConnection();
			System.out.println(personbean);
			System.out.println(connectionbean);
		}

	}

}
