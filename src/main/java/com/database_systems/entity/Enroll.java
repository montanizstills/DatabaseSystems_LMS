package com.database_systems.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Enroll {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String enrollId;
    @ManyToOne(targetEntity = Student.class)
    private Long studentId;
    @ManyToOne(targetEntity = CourseSection.class)
    private Long sectionId;
    @ManyToOne(targetEntity = Admin.class)
    private Long adminId;
    private Date enrollTime;
}
