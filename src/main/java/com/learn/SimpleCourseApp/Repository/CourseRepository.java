package com.learn.SimpleCourseApp.Repository;

import com.learn.SimpleCourseApp.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

// <Tên thực thể, Khóa chính>
public interface CourseRepository extends JpaRepository<Course, Long> {
    // Có sẵn các method cơ bản: find, findAll, save, delete
}
