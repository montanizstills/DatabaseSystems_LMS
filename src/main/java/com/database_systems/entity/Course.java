package com.database_systems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    @Id
    private String courseNo;
    private String courseName;
    private String prerequisite;
    private String description;
    private Float credit;
}
