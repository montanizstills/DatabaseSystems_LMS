package com.database_systems.repository;

import com.database_systems.entity.CourseSection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSectionRepository extends JpaRepository<CourseSection,Long> {
}
