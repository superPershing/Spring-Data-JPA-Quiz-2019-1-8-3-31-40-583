package com.example.employee.entity;


import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Company {
    private int id;
    private String companyName;
    private int employeesNumber;

    public Company() {
    }

    public Company(int id, String companyName, int employeesNumber) {
        this.id = id;
        this.companyName = companyName;
        this.employeesNumber = employeesNumber;
    }
}
