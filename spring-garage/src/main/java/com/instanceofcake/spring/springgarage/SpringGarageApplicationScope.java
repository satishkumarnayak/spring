/*
 * package com.instanceofcake.spring.springgarage;
 * 
 * import org.springframework.boot.SpringApplication; import
 * org.springframework.boot.autoconfigure.SpringBootApplication; import
 * org.springframework.context.ApplicationContext; import
 * org.springframework.context.ConfigurableApplicationContext;
 * 
 * import com.instanceofcake.spring.springgarage.basic.BinarySearchImpl; import
 * com.instanceofcake.spring.springgarage.scope.JDBCConnection; import
 * com.instanceofcake.spring.springgarage.scope.PersonDAO;
 * 
 * @SpringBootApplication public class SpringGarageApplicationScope {
 * 
 * public static void main(String[] args) {
 * 
 * 
 * 
 * ApplicationContext context =
 * SpringApplication.run(SpringGarageApplicationScope.class, args);
 * 
 * PersonDAO bean = context.getBean(PersonDAO.class); JDBCConnection connection
 * = bean.getConnection(); PersonDAO bean1 = context.getBean(PersonDAO.class);
 * JDBCConnection connection1 = bean.getConnection(); System.out.println(bean);
 * System.out.println(bean1); System.out.println(connection);
 * System.out.println(connection1);
 * 
 * }
 * 
 * }
 */