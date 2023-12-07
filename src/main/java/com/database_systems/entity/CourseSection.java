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
public class CourseSection {
    @Id
    private Long sectionId;
    @ManyToOne(targetEntity = Course.class)
    private Long courseNo;
    private Long sectionNo;
    private String semester;
    private Integer capacity;
    private Long instructorId;
    private String room;
}
