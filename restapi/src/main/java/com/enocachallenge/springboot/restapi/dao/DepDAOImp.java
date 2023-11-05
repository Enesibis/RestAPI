package com.enocachallenge.springboot.restapi.dao;

import com.enocachallenge.springboot.restapi.model.Department;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class DepDAOImp implements DepDAO {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Department> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Department> query = currentSession.createQuery("from Department ",Department.class);
        List<Department> list = query.getResultList();
        return list;
    }

    @Override
    public Department get(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Department departmentObj = currentSession.get(Department.class, id);
        return departmentObj;
    }

    @Override
    public void save(Department department) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(department);
    }

    @Override
    public void delete(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Department departmentObj = currentSession.get(Department.class, id);
        currentSession.delete(departmentObj);
    }
}
