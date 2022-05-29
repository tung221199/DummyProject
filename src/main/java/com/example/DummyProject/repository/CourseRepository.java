package com.example.DummyProject.repository;

import com.example.DummyProject.dto.CourseDTO;
import com.example.DummyProject.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    @Query(value = "select sc.courses_id as courseId, c.name as courseName, count(*) as totalStudent\n" +
            "from student_courses sc \n" +
            "inner join course c on c.id = sc.courses_id \n" +
            "group by sc.courses_id, c.name", nativeQuery = true)
    List<CourseDTO> getTotalStudentInCourse();

}
