package com.imooc.course.client;

import com.imooc.course.entity.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseListClientHystrix implements CourseListClient{
    @Override
    public List<Course> courseList() {
        ArrayList<Course> defaultCourses = new ArrayList<>();
        Course course = new Course(1, 1, "默认课程", 1);
        defaultCourses.add(course);
        return defaultCourses;
    }
}
