package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliverRepository extends JpaRepository<Course, Long> {
}
