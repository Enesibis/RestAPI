package com.enocachallenge.springboot.restapi.service;

import com.enocachallenge.springboot.restapi.dao.DepDAO;
import com.enocachallenge.springboot.restapi.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepServiceImp implements DepService {
    @Autowired
    private DepDAO departmentDAO;

    @Transactional
    @Override
    public List<Department> get() {
        return departmentDAO.get();
    }
    @Transactional
    @Override
    public Department get(int id) {
        return departmentDAO.get(id);
    }
    @Transactional
    @Override
    public void save(Department department) {
        departmentDAO.save(department);
    }
    @Transactional
    @Override
    public void delete(int id) {
        departmentDAO.delete(id);
    }
}
