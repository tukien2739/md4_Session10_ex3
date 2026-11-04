
package com.example.session10.model;

public class Employee {

    private Long id;
    private String fullName;
    private Double salary;

    public Employee(Long id, String fullName, Double salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Double getSalary() {
        return salary;
    }
}
