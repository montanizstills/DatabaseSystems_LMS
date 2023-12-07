package com.database_systems.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseSection {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sectionId;
    @ManyToOne(targetEntity = Course.class)
    private Long courseNo;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sectionNo;
    private String semester;
    private Integer capacity;
    @ManyToOne(targetEntity = Admin.class)
    private Long instructorId;
    private String room;
}
