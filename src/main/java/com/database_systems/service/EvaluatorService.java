package com.database_systems.service;

import com.database_systems.entity.Enroll;
import com.database_systems.repository.EnrollRepository;
import com.database_systems.repository.EvaluatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvaluatorService {

    @Autowired
    private final EvaluatorRepository evaluatorRepository;
    @Autowired
    private final EnrollRepository enrollRepository;

    public EvaluatorService(EvaluatorRepository evaluatorRepository, EnrollRepository enrollRepository) {
        this.evaluatorRepository = evaluatorRepository;
        this.enrollRepository = enrollRepository;
    }


    public Enroll enrollStudent(String studentId, String sectionId) {
//        Enroll enroll = new Enroll(
//                null,
//                Long.valueOf(studentId),
//                Long.valueOf(sectionId),
//                null,
//                null
//        );
        Enroll enroll = new Enroll();
        enroll.setStudentId(Long.valueOf(studentId));
        enroll.setSectionId(Long.valueOf(sectionId));
        System.out.println(enroll);
        return this.enrollRepository.save(enroll);
    }

    public Enroll deEnrollStudent(String studentId, String sectionId) {
        Enroll enroll = enrollRepository.findByStudentIdAndSectionId(
                Long.valueOf(studentId),
                Long.valueOf(sectionId)
        );
        this.enrollRepository.delete(enroll);
        return enroll;
    }
}
