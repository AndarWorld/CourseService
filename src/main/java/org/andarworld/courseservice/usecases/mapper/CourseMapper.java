package org.andarworld.courseservice.usecases.mapper;

import org.andarworld.courseservice.persistence.model.Course;
import org.andarworld.courseservice.usecases.dto.CourseResponseDto;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface CourseMapper {

    @Mapping(target = "periodFrom", expression = "java(course.getPeriodFrom().toString())")
    @Mapping(target = "periodTo", expression = "java(course.getPeriodTo().toString())")
    CourseResponseDto fromEntityToDto(Course course);
}
