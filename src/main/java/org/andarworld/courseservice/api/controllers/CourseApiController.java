package org.andarworld.courseservice.api.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.andarworld.courseservice.usecases.CourseService;
import org.andarworld.courseservice.usecases.dto.CourseResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
@Slf4j
public class CourseApiController {

    private final CourseService courseService;

    @GetMapping("/{uuid}")
    public ResponseEntity<List<CourseResponseDto>> getAllCourses(@PathVariable String uuid) {
        log.debug("Getting all courses");
        List<CourseResponseDto> courses = courseService.getCoursesByUniversityUuid(uuid);
        return ResponseEntity.ok(courses);
    }
}
