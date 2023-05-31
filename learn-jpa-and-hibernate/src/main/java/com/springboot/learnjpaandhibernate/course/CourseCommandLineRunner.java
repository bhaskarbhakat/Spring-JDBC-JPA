package com.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// import com.springboot.learnjpaandhibernate.course.jpa.repository.CourseJpaRepository;
import com.springboot.learnjpaandhibernate.course.springDataJpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner  {

    // @Autowired
    // private CourseJdbcRepository repository;

    // @Autowired
    // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        repository.save(new Course(1, "Learn AWS", "Bhaskar Bhakat"));
        repository.save(new Course(2, "Learn DBMS", "Bhaskar Bhakat"));
        repository.save(new Course(3, "Learn DBMS", "Bhaskar Bhakat"));
        repository.deleteById(3l);
        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(1l));
        System.out.println(repository.findAll());
        System.out.println(repository.findByAuthor("Bhaskar Bhakat"));
        System.out.println(repository.findByAuthor("Bhaskar_Bhakat"));
        System.out.println(repository.searchByName("Learn AWS"));
        System.out.println(repository.searchByName("Learn_AWS"));
    }
    
}
