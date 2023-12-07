package com.database_systems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RubricGrade {
    @Id
    private Long rubricGradeNo;
    @ManyToOne(targetEntity = Rubric.class)
    private Long rubricId;
    @ManyToOne(targetEntity = Evaluator.class)
    private Long evaluatorId;
    private Float rubricGrade;

}
