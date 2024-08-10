package com.spring.practice.Practice;


import org.apache.naming.factory.BeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserService userService) {
		return args -> {
			BeanFactory beanFactory = new BeanFactory();
			ApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
			// Create users and add them using the service
			User user1 = new User();
			user1.setUsername("john_doe");

			User user2 = new User();
			user2.setUsername("jane_smith");

			userService.addUser(user1);
			userService.addUser(user2);

			// Retrieve and print all users
			userService.getAllUsers().forEach(System.out::println);
		};
	}
}
