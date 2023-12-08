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
public class CourseGrade {
    @Id @ManyToOne(targetEntity = Student.class, optional = false)
    private Long studentNumber;
    @Id @ManyToOne(targetEntity = CourseSection.class, optional = false)
    private Long sectionNumber;
    @Id @ManyToOne(targetEntity = Course.class, optional = false)
    private Long courseNumber;
    private Double midtermGrade;
    private Double Grade;
    private Double quizGrade;
    private Double cumulativeTotalGrade;


}