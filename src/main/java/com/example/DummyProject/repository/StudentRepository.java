package com.example.DummyProject.repository;

import com.example.DummyProject.dto.IStudentCourse;
import com.example.DummyProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "select sc.studentId,s.studentName,count(*) as totalCourse from student_courses sc \n"+
            " inner join course c on c.id = sc.courses_id \n"+
            "inner join student s on s.id = sc.student_id \n", nativeQuery = true)
    List<IStudentCourse> getALlStudentsAndCourse();
}

