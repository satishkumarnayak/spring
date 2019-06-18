/*
 * package com.instanceofcake.spring.springgarage;
 * 
 * import org.springframework.boot.SpringApplication; import
 * org.springframework.boot.autoconfigure.SpringBootApplication; import
 * org.springframework.context.ApplicationContext; import
 * org.springframework.context.ConfigurableApplicationContext; import
 * org.springframework.context.annotation.ComponentScan;
 * 
 * import com.instanceofcake.spring.compscan.CompJDBCConnection; import
 * com.instanceofcake.spring.compscan.CompPersonDAO; import
 * com.instanceofcake.spring.springgarage.basic.BinarySearchImpl; import
 * com.instanceofcake.spring.springgarage.scope.JDBCConnection; import
 * com.instanceofcake.spring.springgarage.scope.PersonDAO;
 * 
 * @SpringBootApplication
 * 
 * @ComponentScan("com.instanceofcake.spring.compscan") public class
 * SpringGarageApplicationCompScan {
 * 
 * public static void main(String[] args) {
 * 
 * 
 * 
 * ApplicationContext context =
 * SpringApplication.run(SpringGarageApplicationCompScan.class, args);
 * 
 * CompPersonDAO bean = context.getBean(CompPersonDAO.class); CompJDBCConnection
 * connection = bean.getConnection();
 * 
 * 
 * }
 * 
 * }
 */