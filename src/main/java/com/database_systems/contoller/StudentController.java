package com.database_systems.contoller;

import com.database_systems.entity.Student;
import com.database_systems.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student-controller")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(path = "/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        System.out.println(student);
        final Student responseBody = studentService.create(student);
        return new ResponseEntity<Student>(responseBody, HttpStatus.OK);
    }

    @GetMapping(path = "/read")
    public ResponseEntity<Student> readStudent(@RequestBody Student student) {
        final Student responseBody = studentService.read(student);
        return new ResponseEntity<Student>(responseBody, HttpStatus.OK);
    }

    @PostMapping(path = "/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        final Student responseBody = studentService.update(student);
        return new ResponseEntity<Student>(responseBody, HttpStatus.OK);
    }

    @DeleteMapping(path = "/delete")
    public ResponseEntity<Student> deleteStudent(@RequestBody Student student) {
        final Student responseBody = studentService.delete(student);
        return new ResponseEntity<Student>(responseBody, HttpStatus.OK);
    }
}
