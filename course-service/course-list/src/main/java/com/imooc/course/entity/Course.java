package com.imooc.course.entity;

import java.io.Serializable;

public class Course implements Serializable {
    Integer id;
    Integer courseId;
    String name;
    Integer valid;

    public Course(Integer id, Integer courseId, String name, Integer valid) {
        this.id = id;
        this.courseId = courseId;
        this.name = name;
        this.valid = valid;
    }

    public Course() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }
}
