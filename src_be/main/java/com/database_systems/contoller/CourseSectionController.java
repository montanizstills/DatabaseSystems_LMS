package com.database_systems.contoller;

import com.database_systems.entity.CourseSection;
import com.database_systems.service.CourseSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/course-section-controller")
public class CourseSectionController {
    public final CourseSectionService courseSectionService;

    @Autowired
    public CourseSectionController(CourseSectionService courseSectionService) {
        this.courseSectionService = courseSectionService;
    }

    @PostMapping(path = "/create-course-section")
    public ResponseEntity<CourseSection> create(@RequestBody CourseSection courseSection) {
        CourseSection responseBody = this.courseSectionService.createCourseSection(courseSection);
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    @GetMapping(path = "/read-course-section")
    public ResponseEntity<CourseSection> read(@RequestBody Map<String, String> course) {
        CourseSection responseBody = this.courseSectionService
                .readCourseSection(
                        course.get("semester"),
                        Long.valueOf(course.get("courseNo")),
                        Long.valueOf(course.get("sectionNo"))
                );
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    @PatchMapping(path = "/update-course-section")
    public ResponseEntity<CourseSection> update(@RequestBody CourseSection courseSection) {
        CourseSection responseBody = this.courseSectionService.updateCourseSection(courseSection);
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    @DeleteMapping(path = "/delete-course-section")
    public ResponseEntity<CourseSection> delete(@RequestBody CourseSection courseSection) {
        CourseSection responseBody = this.courseSectionService.deleteCourseSection(courseSection);
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }
}
