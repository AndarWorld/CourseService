package org.andarworld.courseservice.api.exception;

public class CoursesNotFoundException extends RuntimeException {
    public CoursesNotFoundException(String message) {
        super(message);
    }
}
