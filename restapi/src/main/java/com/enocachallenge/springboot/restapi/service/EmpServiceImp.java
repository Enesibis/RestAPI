package com.enocachallenge.springboot.restapi.service;

import com.enocachallenge.springboot.restapi.dao.EmpDAO;
import com.enocachallenge.springboot.restapi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmpServiceImp implements EmpService {
    @Autowired
    private EmpDAO employeeDAO;
    @Transactional
    @Override
    public List<Employee> get() {
        return employeeDAO.get();
    }
    @Transactional
    @Override
    public Employee get(int id) {
        return employeeDAO.get(id);
    }
    @Transactional
    @Override
    public void save(Employee employee) {
        employeeDAO.save(employee);
    }
    @Transactional
    @Override
    public void delete(int id) {
        employeeDAO.delete(id);
    }
}
