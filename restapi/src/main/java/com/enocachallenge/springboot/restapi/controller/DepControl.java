package com.enocachallenge.springboot.restapi.controller;

import com.enocachallenge.springboot.restapi.model.Department;
import com.enocachallenge.springboot.restapi.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepControl {
    @Autowired
    private DepService departmentService;
    @GetMapping("/department")
    public List<Department> get() {
        return departmentService.get();
    }
    @PostMapping("/department")
    public Department save(@RequestBody Department departmentObj){
        departmentService.save(departmentObj);
        return departmentObj;
    }
    @GetMapping("/department/{id}")
    public Department get(@PathVariable int id){
        return departmentService.get(id);
    }
    @DeleteMapping("/department/{id}")
    public String delete(@PathVariable int id){
        departmentService.delete(id);
        return "Departman silindi : " + id;
    }
    public Department update(@RequestBody Department departmentObj){
        departmentService.save(departmentObj);
        return departmentObj;
    }

}
