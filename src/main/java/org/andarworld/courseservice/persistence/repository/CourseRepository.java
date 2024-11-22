package org.andarworld.courseservice.persistence.repository;

import org.andarworld.courseservice.persistence.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Optional<List<Course>> findAllByUniversityUuid(UUID uuid);
}
