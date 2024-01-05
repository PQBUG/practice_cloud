package com.imooc.course.entity;

import java.io.Serializable;

public class CoursePrice implements Serializable {
    Integer id;
    Integer courseId;
    Integer price;

    public CoursePrice(Integer id, Integer courseId, Integer price) {
        this.id = id;
        this.courseId = courseId;
        this.price = price;
    }

    public CoursePrice() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
