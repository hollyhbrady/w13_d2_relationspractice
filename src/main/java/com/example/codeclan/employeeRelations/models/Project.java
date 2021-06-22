//package com.example.codeclan.employeeRelations.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "projects")
//public class Project {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "project_name", nullable = false)
//    private String project_name;
//
//    @Column(name = "duration")
//    private int duration;
//
////    @JsonIgnoreProperties({"project"})
////    @OneToMany(mappedBy = "project")
//
//    private List<Employee> employees;
//
//    public Project(String project_name, int duration) {
//        this.project_name = project_name;
//        this.duration = duration;
//        this.employees = new ArrayList<Employee>();
//    }
//
//    public Project() {
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getProject_name() {
//        return project_name;
//    }
//
//    public void setProject_name(String project_name) {
//        this.project_name = project_name;
//    }
//
//    public int getDuration() {
//        return duration;
//    }
//
//    public void setDuration(int duration) {
//        this.duration = duration;
//    }
//
//    public List<Employee> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }
//
//}
