package com.database_systems.repository;

import com.database_systems.entity.Enroll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollRepository extends JpaRepository<Enroll,Long> {
    Enroll findByStudentId(Long studentId);

    Enroll findByStudentIdAndSectionId(Long studentId, Long sectionId);
}
