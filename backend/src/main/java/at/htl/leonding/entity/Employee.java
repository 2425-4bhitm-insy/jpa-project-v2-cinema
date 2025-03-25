package at.htl.leonding.entity;

import at.htl.leonding.entity.enumerations.Department;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Employee extends Person {


    @Enumerated(EnumType.STRING)
    @Column
    private Department department;

    @Column
    private double salary;

    @Column
    private LocalDate hireDate;

    public Employee() {
    }

    public Employee(String name, String address, String email, String phoneNumber, int age, Department department, double salary, LocalDate hireDate) {
        super(name, address, email, phoneNumber, age);
        this.department = department;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
