package com.example.DummyProject.repository;

import com.example.DummyProject.dto.IStudentCourse;
import com.example.DummyProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "select s.studentId,s.studnet,count(*) as totalCourse from student s inner join course c", nativeQuery = true)
    List<IStudentCourse> getALlStudentsAndCourse();
}

