package com.database_systems.service;

import com.database_systems.entity.Course;
import com.database_systems.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course createCourse(Course course) {
        return this.courseRepository.save(course);
    }

    public Course getCourse(String courseName) {
        return courseRepository.findByCourseName(courseName);
    }

    public Course updateCourse(Map<String,String> course) {
        Course oldCourse = this.courseRepository.findByCourseName(course.get("courseName"));
        course.forEach((key, value) -> {
            String setter = "set" + key.substring(0, 1).toUpperCase();
            Method method = null;
            try {
                method = Course.class.getMethod(setter);
                method.invoke(oldCourse, value);
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                throw new Error(e);
            }

        });
        return courseRepository.save(oldCourse);
    }

    public Course deleteCourse(String courseName) {
        Course course = courseRepository.findByCourseName(courseName);
        this.courseRepository.delete(course);
        return course;
    }
}
