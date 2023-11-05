package com.enocachallenge.springboot.restapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;

    public Integer getDeparmant_id() {
        return id;
    }
    public void setDeparmant_id(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Department{" +
                "deparmant_id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
