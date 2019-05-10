package com.example.employee.entity;

import lombok.Data;

import javax.persistence.Entity;


@Data
@Entity
public class Employee {

    private int id;
    private String name;
    private int age;
    private String gender;
    private int companyId;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, String gender, int companyId, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.companyId = companyId;
        this.salary = salary;
    }
}
