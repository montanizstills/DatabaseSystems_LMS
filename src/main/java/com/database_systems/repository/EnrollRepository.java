package com.database_systems.repository;

import com.database_systems.entity.Enroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EnrollRepository extends JpaRepository<Enroll, String> {
    @Query("SELECT e FROM Enroll e WHERE e.studentId =:studentId AND e.sectionId =:sectionId")
        Enroll findByStudentIdAndSectionId(@Param("studentId") Long studentId, @Param("sectionId") Long sectionId);

}
