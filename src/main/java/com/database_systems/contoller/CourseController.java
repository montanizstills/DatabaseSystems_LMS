package com.database_systems.contoller;

import com.database_systems.entity.Course;
import com.database_systems.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/course-controller")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping(path = "/create-course")
    public ResponseEntity<Course> create(@RequestBody Course course) {
        Course responseBody = this.courseService.createCourse(course);
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    @GetMapping("/read-course")
    public ResponseEntity<Course> read(@RequestBody String courseName) {
        Course responseBody = this.courseService.getCourse(courseName);
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    @PatchMapping("/update-course")
    public ResponseEntity<Course> update(@RequestBody Map<String, String> course) {
        Course responseBody = this.courseService.updateCourse(course);
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    @DeleteMapping("/delete-course")
    public ResponseEntity<Course> deleteCourse(@RequestBody String courseName){
        Course responseBody = this.courseService.deleteCourse(courseName);
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

}
