package com.database_systems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String courseNo;
    private String courseName;
    private String prerequisite;
    private String description;
    private Float credit;
}
