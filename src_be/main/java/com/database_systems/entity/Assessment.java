package com.database_systems.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Assessment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String assessmentNumber;
    @ManyToOne(targetEntity = Evaluator.class)
    private String evaluatorId;
    @ManyToOne(targetEntity = Course.class)
    private String courseId;
    private String assessmentName;
    private String assessmentGrade;
}
