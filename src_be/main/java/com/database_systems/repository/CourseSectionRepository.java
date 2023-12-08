package com.database_systems.repository;

import com.database_systems.entity.CourseSection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CourseSectionRepository extends JpaRepository<CourseSection, Long> {
    @Query("SELECT sectionId FROM CourseSection WHERE semester =: semester AND courseNo =: courseNo AND sectionId =: sectionNo")
    CourseSection findBySemesterAndCourseNoAndSectionNo(
            @Param("semester") String semester,
            @Param("courseNo") Long courseNo,
            @Param("sectionId") Long sectionNo
    );
}
