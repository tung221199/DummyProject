package com.example.DummyProject.repository;

import com.example.DummyProject.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
