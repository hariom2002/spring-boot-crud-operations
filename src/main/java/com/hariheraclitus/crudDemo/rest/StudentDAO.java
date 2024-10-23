package com.hariheraclitus.crudDemo.rest;

import jakarta.transaction.Transactional;

public interface StudentDAO {

//    public void  save();

    @Transactional
    void save(Student theStudent);

    Student findId(Integer id);
}
