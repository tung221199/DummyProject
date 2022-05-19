package com.example.DummyProject.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "dob")
    private Date dob;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "email")
    private String email;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", phone='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
