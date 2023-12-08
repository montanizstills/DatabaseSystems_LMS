package com.database_systems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Admin {
    @Id
    private Long adminId;
    private String lastName;
    private String firstName;
    private String phone;
    @ManyToOne(targetEntity = Department.class)
    @JoinColumn(name = "deptId",referencedColumnName = "deptId")
    private Long deptId;
}
