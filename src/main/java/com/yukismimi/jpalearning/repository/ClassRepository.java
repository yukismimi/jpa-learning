package com.yukismimi.jpalearning.repository;

import com.yukismimi.jpalearning.entity.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Clazz, Long> {
}
