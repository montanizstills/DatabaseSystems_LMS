package com.database_systems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
    @JoinColumn(name = "rubricId", referencedColumnName = "rubricNo" )
    private Long rubricId;
    @ManyToOne(targetEntity = Evaluator.class)
    @JoinColumn(name = "evaluatorId", referencedColumnName = "evaluatorId")
    private Long evaluatorId;
    private Float rubricGrade;

}
