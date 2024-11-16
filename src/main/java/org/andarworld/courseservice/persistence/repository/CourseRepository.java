package org.andarworld.courseservice.persistence.repository;

import org.andarworld.courseservice.persistence.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findAllByUniversityUuid(String uuid);
}
