package com.learn.SimpleCourseApp.Controller;

import com.learn.SimpleCourseApp.Entity.Course;
import com.learn.SimpleCourseApp.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Đánh dấu đây là Controller
@Controller

// Đường dẫn của controller
@RequestMapping(value="/")
public class HomeController {
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public String getView(Model model){
        String yourName = "Phuc";
        // Gắn biến yourName vào model
        model.addAttribute("Phan Lop", yourName);

        // Lấy tất cả Course trong database
        List<Course> allCourse = courseRepository.findAll();
        model.addAttribute("courses", allCourse);

        // Tạo new Course;
        Course course = new Course();
        model.addAttribute("newCourse", course);

        // Trả về file html ở resources/templates
        return "myHomeView";
    }

    @PostMapping
    public String createCourse(@ModelAttribute Course newCourse, Model model){
        courseRepository.save(newCourse);
        model.addAttribute("status", "Insert thành công "+newCourse.getCourseName());
        return getView(model);
    }

    @DeleteMapping
    public String removeCourse(@ModelAttribute Course newCourse, Model model){
        // Todo
        // Hàm xóa là hàm delete
        return null;
    }
}
