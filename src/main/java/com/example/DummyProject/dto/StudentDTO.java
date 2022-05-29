package com.example.DummyProject.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

@Data
public class StudentDTO {
    private Long id;

    private String name;

    private int age;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dob;

    private String phoneNumber;

    private String email;
}
