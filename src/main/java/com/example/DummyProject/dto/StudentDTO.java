package com.example.DummyProject.dto;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class StudentDTO {
    private Long id;

    private String name;

    private int age;

    private Date dob;

    private String phoneNumber;

    private String email;
}
