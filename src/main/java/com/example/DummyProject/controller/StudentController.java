package com.example.DummyProject.controller;

import com.example.DummyProject.dto.IStudentCourse;
import com.example.DummyProject.dto.StudentDTO;
import com.example.DummyProject.entity.Student;
import com.example.DummyProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Access;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("")
    public ResponseEntity<List<StudentDTO>>  getAllStudent(){
        return ResponseEntity.ok(studentService.getAllStudent());
    }
    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getStudentById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.getStudentById(id));
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

    @GetMapping("/course")
    public ResponseEntity<List<IStudentCourse>> getALlStudentAndCourse(){
        List<IStudentCourse> iStudentCourses=studentService.getALlStudentsAndCourse();
        return new ResponseEntity<>(iStudentCourses, HttpStatus.OK);
    }
}
