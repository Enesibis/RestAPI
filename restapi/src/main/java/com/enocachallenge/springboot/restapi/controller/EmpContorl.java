package com.enocachallenge.springboot.restapi.controller;

import com.enocachallenge.springboot.restapi.model.Employee;
import com.enocachallenge.springboot.restapi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpContorl {
    @Autowired
    private EmpService employeeService;

    @GetMapping("/employee")
    public List<Employee> get(){
        return employeeService.get();
    }
    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employeeObj){
        employeeService.save(employeeObj);
        return employeeObj;
    }
    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable int id){
        Employee employeeObj = employeeService.get(id);
        if (employeeObj == null){
            throw new RuntimeException( id + " id numaralı çalışan bulunamadı.");
        }
        return employeeObj;
    }
    @DeleteMapping("/employee/{id}")
    public String delete(@PathVariable int id){
        employeeService.delete(id);
        return "Çalışan silindi : " + id;
    }
    @PutMapping("/employee")
    public Employee update(@RequestBody Employee employeeObj){
        employeeService.save(employeeObj);
        return employeeObj;
    }
}
