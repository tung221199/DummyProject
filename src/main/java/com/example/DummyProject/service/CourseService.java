package com.example.DummyProject.service;

import com.example.DummyProject.dto.CourseDTO;
import com.example.DummyProject.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;


    public List<CourseDTO> getTotalStudentInCourse() {
        return courseRepository.getTotalStudentInCourse();
    }
}
