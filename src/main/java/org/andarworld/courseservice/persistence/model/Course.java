package org.andarworld.courseservice.persistence.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "courses")
@Builder(setterPrefix = "with")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String universityUuid;

    @Column
    private String specialtyCode;

    @Column(name="course_name")
    private String name;

    @Column
    private String description;

    @Column
    private LocalDate periodFrom;

    @Column
    private LocalDate periodTo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(specialtyCode, course.specialtyCode) && Objects.equals(name, course.name) && Objects.equals(description, course.description) && Objects.equals(periodFrom, course.periodFrom) && Objects.equals(periodTo, course.periodTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialtyCode, name, description, periodFrom, periodTo);
    }

    @Override
    public String toString() {
        return "Course{" +
                ", specialtyCode='" + specialtyCode + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", periodFrom=" + periodFrom +
                ", periodTo=" + periodTo +
                '}';
    }
}
