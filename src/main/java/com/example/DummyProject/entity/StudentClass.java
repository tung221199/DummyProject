package com.example.DummyProject.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class StudentClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "work_shop_score")
    private Long workShopScore;

    @Column(name = "test_score")
    private Long testScore;

    @Column(name = "exam_score")
    private Long examScore;
}
