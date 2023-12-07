package com.database_systems.service;

import com.database_systems.repository.StudentRepository;
import com.database_systems.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public Student create(Student student) {
        System.out.println(student.toString());
        return studentRepository.save(student);
    }

    public Student read(Student student) {
        return this.studentRepository.findById(student.getId()).get();
    }

    public Student update(Student student) {
        return this.studentRepository.save(student);
    }

    public Student delete(Student student) {
        this.studentRepository.delete(student);
        return student;
    }
}
