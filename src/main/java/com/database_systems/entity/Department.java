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
public class Department {
    @Id
    private String deptId;
    private String deptName;
    private String deptNumber;
    private String deptLocation;
}
