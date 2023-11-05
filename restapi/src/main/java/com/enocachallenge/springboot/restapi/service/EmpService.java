package com.enocachallenge.springboot.restapi.service;

import com.enocachallenge.springboot.restapi.model.Employee;

import java.util.List;

public interface EmpService {
    List<Employee> get();
    Employee get(int id);
    void save(Employee employee);
    void delete(int id);
}
