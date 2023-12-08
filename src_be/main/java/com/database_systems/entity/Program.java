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
public class Program {
    @Id
    private Long programId;
    private String programStatement;
    @ManyToOne(targetEntity = Department.class)
    private Long deptId;
}
