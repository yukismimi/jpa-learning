package com.yukismimi.jpalearning.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long classId;

    @ManyToMany
    @JoinTable(name = "course_student_relation",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courseList;
}
