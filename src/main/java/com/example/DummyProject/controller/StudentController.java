package com.example.DummyProject.controller;

import com.example.DummyProject.entity.Student;
import com.example.DummyProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("")
    ResponseEntity<List<Student>> getAllStudent(){
return ResponseEntity.ok(studentService.getAll())
    }

}
