package com.luizedu.cruddemo.dao;

import com.luizedu.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO{

    private final EntityManager entityManager;

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

}
