package com.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner  {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        repository.insert(new Course(1, "Learn DBMS", "Bhaskar Bhakat"));
        repository.insert(new Course(2, "Learn DBMS", "Bhaskar Bhakat"));
        repository.insert(new Course(3, "Learn DBMS", "Bhaskar Bhakat"));
        repository.deleteByID(3);
        System.out.println(repository.findByID(2));


    }
    
}
