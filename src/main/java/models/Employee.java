package models;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first name", nullable = false)
    private String first_name;

    @Column(name = "last name", nullable = false)
    private String last_name;

    @Column(name = "employee number", nullable = false, unique = true)
    private int employee_number;

    @Column(name = "projects")
    private List<Project> projects;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;


    public Employee(String first_name, String last_name, int employee_number, List<Project> projects, Department department) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.employee_number = employee_number;
        this.projects = projects;
        this.department = department;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getEmployee_number() {
        return employee_number;
    }

    public void setEmployee_number(int employee_number) {
        this.employee_number = employee_number;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}