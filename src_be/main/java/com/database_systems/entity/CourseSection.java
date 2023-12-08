package com.database_systems.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * The Entity annotation is used to provide Dependency Injection support to the Entity (Class) with other Spring Beans.
 * The Getter and Setter annotations are lomobok protocols that simplify explicitly writing getters and setters for each field.
 * The AllArgsConstructor and NoArgsConstructor annotations are lomobok protocols that simplify explicitly writing constructors.
 * The ToString annotation is a lomobk protocol that resolves toString() to "Class(field0='this.field0', field1, field2, ...field_n='this.field_n')"
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseSection {
    @Id // The ID annotation marks this field as a PrimaryKey
    @GeneratedValue(strategy = GenerationType.AUTO)
    //GeneratedValue determines how the Spring or the Database will autogenerate this value.
    private Long sectionId;
    //The ManyToOne annotation bootstraps this DTO's field to the target entity's Primary Key
    @ManyToOne(targetEntity = Course.class)
    @JoinColumn(name = "courseNo", referencedColumnName = "courseNo")
    private Long courseNo;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sectionNo;
    private String semester;
    private Integer capacity;
    @ManyToOne(targetEntity = Admin.class)
    @JoinColumn(name = "instructorId", referencedColumnName = "adminId")
    private Long instructorId;
    private String room;
}
