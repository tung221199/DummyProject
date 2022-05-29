package com.example.DummyProject.controller;

import com.example.DummyProject.dto.CourseDTO;
import com.example.DummyProject.repository.CourseRepository;
import com.example.DummyProject.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/course")

public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/total")
    public ResponseEntity<List<CourseDTO>> GetAllStudentInACourse(){
    List<CourseDTO> courseDTO = courseService.getTotalStudentInCourse();
    return new ResponseEntity<>(courseDTO, HttpStatus.OK);
    }
}
