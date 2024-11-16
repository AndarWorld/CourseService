package org.andarworld.courseservice.usecases;

import org.andarworld.courseservice.usecases.dto.CourseResponseDto;

import java.util.List;

public interface CourseService {
    List<CourseResponseDto> getAllCourses();
    List<CourseResponseDto> getCoursesByUniversityUuid(String uuid);
}
