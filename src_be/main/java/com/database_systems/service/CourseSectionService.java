package com.database_systems.service;

import com.database_systems.entity.CourseSection;
import com.database_systems.repository.CourseSectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseSectionService {
    private final CourseSectionRepository courseSectionRepository;

    @Autowired
    public CourseSectionService(CourseSectionRepository courseSectionRepository) {
        this.courseSectionRepository = courseSectionRepository;
    }


    public CourseSection createCourseSection(CourseSection courseSection) {
        return this.courseSectionRepository.save(courseSection);
    }

    public CourseSection readCourseSection(String semester, Long courseNo, Long sectionId) {
        return this.courseSectionRepository.findBySemesterAndCourseNoAndSectionNo(semester,courseNo,sectionId);
    }

    public CourseSection updateCourseSection(CourseSection courseSection) {
        return null;
    }

    public CourseSection deleteCourseSection(CourseSection courseSection) {
        return null;
    }
}
