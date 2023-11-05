package com.enocachallenge.springboot.restapi.dao;

import com.enocachallenge.springboot.restapi.model.Employee;

import java.util.List;

public interface EmpDAO {
    List<Employee> get();
    Employee get(int id);
    void save(Employee employee);
    void delete(int id);
}
