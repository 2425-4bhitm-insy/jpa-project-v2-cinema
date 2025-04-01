package at.htl.leonding.entity;

import jakarta.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String departmentName;

    @Column
    private int departmentCapacity;

    public Department(String departmentName, int departmentCapacity) {
        this.departmentName = departmentName;
        this.departmentCapacity = departmentCapacity;
    }

    public Department() {

    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentCapacity() {
        return departmentCapacity;
    }

    public void setDepartmentCapacity(int departmentCapacity) {
        this.departmentCapacity = departmentCapacity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
