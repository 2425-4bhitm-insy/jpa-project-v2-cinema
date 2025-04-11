package at.htl.leonding.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Employee extends Person {

    @Column
    private double salary;

    @Column
    private LocalDate hireDate;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Employee() {}

    public Employee(String name, String email, String phoneNumber, LocalDate birthDate, Department department, double salary, LocalDate hireDate) {
        super(name, email, phoneNumber, birthDate);
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
