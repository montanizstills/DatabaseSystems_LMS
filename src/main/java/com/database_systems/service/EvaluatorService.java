package com.database_systems.service;

import com.database_systems.entity.Enroll;
import com.database_systems.repository.EvaluatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvaluatorService {

    @Autowired
    private final EvaluatorRepository evaluatorRepository;

    public EvaluatorService(EvaluatorRepository evaluatorRepository) {
        this.evaluatorRepository = evaluatorRepository;
    }


    public Enroll enrollStudent(String studentId, String sectionId) {
        return null;
    }

    public Enroll deEnrollStudent(String studentId, String sectionId) {
        return null;
    }
}
