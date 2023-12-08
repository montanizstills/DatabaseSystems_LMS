package com.database_systems.contoller;

import com.database_systems.entity.Enroll;
import com.database_systems.service.EvaluatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/evaluator-controller")
public class EvaluatorController {
    private final EvaluatorService evaluatorService;

    @Autowired
    public EvaluatorController(EvaluatorService evaluatorService){
        this.evaluatorService=evaluatorService;
    }

    @PostMapping(path = "/assign-student-course-section")
    public ResponseEntity<Enroll> registerStudentForCourseSection(@RequestBody Map<String,String> studentIdAndSectionIdJSON){
        String studentId = studentIdAndSectionIdJSON.get("studentId");
        String sectionId = studentIdAndSectionIdJSON.get("sectionId");
        Enroll enroll = evaluatorService.enrollStudent(studentId,sectionId);
        return new ResponseEntity<>(enroll, HttpStatus.OK);
    }

    @PostMapping("/deregister-student-course-section")
    public ResponseEntity<Enroll> deregisterStudentForCourseSection(@RequestBody Map<String, String> studentIdAndSectionIdJSON){
        String studentId = studentIdAndSectionIdJSON.get("studentId");
        String sectionId = studentIdAndSectionIdJSON.get("sectionId");
        Enroll deEnroll = evaluatorService.deEnrollStudent(studentId,sectionId);
        return new ResponseEntity<>(deEnroll,HttpStatus.OK);
    }

}
