package com.yukismimi.jpalearning.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;

  @ManyToMany(mappedBy = "courseList")
  @JsonIgnore
  private List<Student> studentList;

}
