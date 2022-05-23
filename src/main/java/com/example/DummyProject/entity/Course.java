package com.example.DummyProject.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Course {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;
}
