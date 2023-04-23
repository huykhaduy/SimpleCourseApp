package com.learn.SimpleCourseApp;

import com.learn.SimpleCourseApp.Entity.Course;
import com.learn.SimpleCourseApp.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleCourseAppApplication implements CommandLineRunner {
	@Autowired
	// Thẻ Autowired tự động khởi tạo new CourseRepository()
	private CourseRepository courseRepository;

	public static void main(String[] args) {
		// Hàm chính của chương trình
		SpringApplication.run(SimpleCourseAppApplication.class, args);
	}

	// Hàm này sẽ được chạy khi chương trình được thực thi
	@Override
	public void run(String... args) throws Exception {
		System.out.println("----- Ham run trong main ----");
		// Tạo 5 khóa học
		for(int i=0;i<5;i++){
			Course course = new Course();
			course.setCourseName("Khóa học thứ "+ i);
			courseRepository.save(course);
		}
	}
}
