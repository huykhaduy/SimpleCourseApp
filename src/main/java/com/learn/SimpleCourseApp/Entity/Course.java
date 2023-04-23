package com.learn.SimpleCourseApp.Entity;

import jakarta.persistence.*;

// @Entity để nói với Spring đây là một thực thể trong DB
@Entity
public class Course {
    // @Id: Khóa chính của thực thể
    @Id
    // Đánh dấu trường này sẽ được tự động tăng
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Có thể thêm @Column để khai báo tên tương ứng và một số thuộc tính khác
    @Column(name = "courseName", nullable = false)
    private String courseName;

    public Course() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
