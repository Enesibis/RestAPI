package com.enocachallenge.springboot.restapi.service;

import com.enocachallenge.springboot.restapi.model.Department;

import java.util.List;

public interface DepService {
    List<Department> get();
    Department get(int id);
    void save(Department department);
    void delete(int id);
}
