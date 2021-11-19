package com.sda.dsSDA.iComposite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String department;
    private int salary;

    private List<Employee> subOrdinates;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;

        //initializam un array in caz ca angajatul are si subordonati
        this.subOrdinates = new ArrayList<>();
    }

    public void add(Employee employee){
        this.subOrdinates.add(employee);
    }

    public void remove(Employee employee){
        this.subOrdinates.remove(employee);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name: '" + name + '\'' +
                ", department: '" + department + '\'' +
                ", salary: " + salary +
                ", subOrdinates: " + subOrdinates +
                '}';
    }
}
