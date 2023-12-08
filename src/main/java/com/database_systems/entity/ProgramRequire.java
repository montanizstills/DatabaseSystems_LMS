package com.database_systems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProgramRequire {
    @Id
    private Long programRequireId;
    @ManyToOne(targetEntity = Program.class)
    @JoinColumn(name = "programId", referencedColumnName = "programId")
    private Long programId;
    @ManyToOne(targetEntity = Course.class)
    @JoinColumn(name = "courseNo", referencedColumnName = "courseNo")
    private Long courseNo;
    private Date addTime;
}
