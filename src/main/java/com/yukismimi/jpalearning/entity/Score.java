package com.yukismimi.jpalearning.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class Score {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Long studentId;
  private Long courseId;
  private BigDecimal score;
}
