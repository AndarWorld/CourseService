package org.andarworld.courseservice.usecases.impl;

import lombok.RequiredArgsConstructor;
import org.andarworld.courseservice.persistence.model.Course;
import org.andarworld.courseservice.persistence.repository.CourseRepository;
import org.andarworld.courseservice.usecases.CourseService;
import org.andarworld.courseservice.usecases.dto.CourseResponseDto;
import org.andarworld.courseservice.usecases.mapper.CourseMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    @Override
    public List<CourseResponseDto> getAllCourses() {
        return mapList(courseRepository.findAll());
    }

    @Override
    public List<CourseResponseDto> getCoursesByUniversityUuid(String uuid) {
        return mapList(courseRepository.findAllByUniversityUuid(UUID.fromString(uuid)));
    }

    private List<CourseResponseDto> mapList(List<Course> courses) {
        return courses.stream()
                .map((course) -> courseMapper.fromEntityToDto(course))
                .toList();
    }
}
