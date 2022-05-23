package com.example.DummyProject.service;

import com.example.DummyProject.dto.StudentDTO;
import com.example.DummyProject.entity.Student;
import com.example.DummyProject.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    private ModelMapper modelMapper;

    public List<StudentDTO> getAllStudent() {
        return studentRepository.findAll()
                .stream()
                .map(e -> modelMapper.map(e, StudentDTO.class))
                .collect(Collectors.toList());
    }

    public StudentDTO getStudentById(Long id) {
        return studentRepository.findById(id).map(e -> modelMapper.map(e, StudentDTO.class)).orElseThrow();

    }

    public StudentDTO createStudent(StudentDTO studentDTO) {
        Student student = modelMapper.map(studentDTO,Student.class);
        student = studentRepository.save(student);
        return modelMapper.map(student,StudentDTO.class);
    }

    public StudentDTO editStudent(Long id, StudentDTO studentDTO) {
        Student student= studentRepository.findById(id).orElseThrow();
        student.setName(studentDTO.getName());
        student.setAge(studentDTO.getAge());
        student.setDob(studentDTO.getDob());
        student.setPhoneNumber(studentDTO.getPhoneNumber());
        student.setEmail(studentDTO.getEmail());
        return studentDTO;
    }

    public void deleteStudent(Long id) {
        studentRepository.findById(id).orElseThrow();
        studentRepository.deleteById(id);
    }
}
