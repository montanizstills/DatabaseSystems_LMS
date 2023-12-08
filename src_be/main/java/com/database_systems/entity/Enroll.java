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
    @JoinColumn(name = "studentId", referencedColumnName = "id")
    private Long studentId;
    @ManyToOne(targetEntity = CourseSection.class)
    @JoinColumn(name="sectionId", referencedColumnName = "sectionId")
    private Long sectionId;
    @ManyToOne(targetEntity = Admin.class)
    @JoinColumn(name = "adminId", referencedColumnName = "adminId")
    private Long adminId;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date enrollTime;
}
