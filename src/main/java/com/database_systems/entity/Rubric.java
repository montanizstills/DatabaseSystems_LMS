package com.database_systems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rubric {
    @Id
    private Long rubricNo;
    private String rubricStatement;
    private Date createTime;
}
