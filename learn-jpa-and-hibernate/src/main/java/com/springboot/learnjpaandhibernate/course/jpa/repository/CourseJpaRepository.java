package com.springboot.learnjpaandhibernate.course.jpa.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class CourseJpaRepository {
    
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findByID(long id){
        return entityManager.find(Course.class, id);
    }

    public void deleteByID(long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
    
}
