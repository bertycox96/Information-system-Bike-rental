package com.hnure.interactive.controller;


import com.hnure.interactive.jpa.Category;
import com.hnure.interactive.jpa.Course;
import com.hnure.interactive.repository.CourseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class CourseController {
    private final CourseRepository courseRepository;
    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    @GetMapping("/course")
    public Optional<Course> getCourse(Long id) {
        return courseRepository.findById(id);
    }
    
    @GetMapping("/courses")
    public List<Course> getCourses(Long id) {
        return courseRepository.findAll();
    }
    @PostMapping("/course")
    public void addCourse(String tittle, String description, Category category,Integer price) {
         courseRepository.save(new Course());
    }
    @PostMapping("/coursedelete")
    public void deleteCourse(Course course) {
        courseRepository.delete(course);
    }
    @PostMapping("/courseupdate")
    public void updateProfitCourse(Course course,Integer profit) {
        course.setProfit(profit);
        courseRepository.save(course);
    }
}
