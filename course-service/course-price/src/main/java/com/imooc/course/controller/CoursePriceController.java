package com.imooc.course.controller;

import com.imooc.course.client.CourseListClient;
import com.imooc.course.entity.Course;
import com.imooc.course.entity.CoursePrice;
import com.imooc.course.service.CoursePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursePriceController {
    @Autowired
    private CoursePriceService coursePriceService;

    @Autowired
    private CourseListClient courseListClient;

    @GetMapping("/price")
    public CoursePrice getCoursePrice(Integer courseId){
        return coursePriceService.getCoursePrice(courseId);
    }

    @GetMapping("/coursesInPrice")
    public List<Course> coursesInPrice(){
        return courseListClient.courseList();
    }
}
