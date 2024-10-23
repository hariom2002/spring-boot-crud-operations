package com.hariheraclitus.crudDemo.rest;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImp implements StudentDAO {

    private EntityManager entityManager;

//    INJECTING ENTITIY MANGER TO DAOIMP
    @Autowired
    public StudentDAOImp(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Transactional
    @Override
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findId(Integer id) {
        return entityManager.find(Student.class, id);
    }
}
