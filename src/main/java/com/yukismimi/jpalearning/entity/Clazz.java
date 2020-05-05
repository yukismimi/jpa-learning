package com.yukismimi.jpalearning.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "class")
public class Clazz {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;

  @OneToMany
  @JoinColumn(name = "classId")
  private List<Student> studentList;
}
