package com.springboot.learnjpaandhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnJpaAndHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJpaAndHibernateApplication.class, args);
	}

}

// JDBC:
// -> Write a lot of SQL queries
// -> And write a lot of java code

// Spring JDBC:
// -> Write a lot of SQL queries
// -> But lesser java code
