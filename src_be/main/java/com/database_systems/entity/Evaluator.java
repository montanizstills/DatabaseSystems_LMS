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
public class Evaluator {
    @Id
    private Long evaluatorId;
    @ManyToOne(targetEntity = Department.class)
    private Long deptId;
    private String lastName;
    private String firstName;
    private String phoneNumber;
}
