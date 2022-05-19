package com.example.DummyProject.controller;

import com.example.DummyProject.dto.StudentDTO;
import com.example.DummyProject.entity.Student;
import com.example.DummyProject.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/students")
public class StudentController {
    private StudentService studentService;

    @GetMapping("")
    public ResponseEntity<List<StudentDTO>>  getAllStudent(){
        return ResponseEntity.ok(studentService.getAllStudent());
    }
    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getStudentById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.getStudentbyId(id));
    }

    @PostMapping
    public ResponseEntity<?> addStudent(@RequestBody StudentDTO studentDTO){
        studentDTO = studentService.createStudent(studentDTO);
        return ResponseEntity.ok(studentDTO);
    }
    @PutMapping("/{id}")
    public ResponseEntity<StudentDTO> editStudent(@PathVariable Long id,@RequestBody StudentDTO studentDTO){
        studentDTO= studentService.editStudent(id,studentDTO);
        return ResponseEntity.ok(studentDTO);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<StudentDTO> deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}
