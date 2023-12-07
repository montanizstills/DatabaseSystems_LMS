package com.database_systems.repository;

import com.database_systems.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CourseRepository extends JpaRepository<Course, Long> {
    //    @Query("SELECT c.courseNo FROM Course c WHERE c.courseName = :courseName")
    //    Course findByCourseName(@Param("courseNo") String courseName);
    Course findByCourseName(String courseName);
}
