package com.springboot.learnjpaandhibernate.course.springDataJpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.learnjpaandhibernate.course.Course;
import java.util.List;


public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
    
    List<Course> findByAuthor(String author);
    List<Course> searchByName(String name);
    // List<Course> searchByCourseName(String courseName);
}
