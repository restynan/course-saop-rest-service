package com.example.courseintg.controller;

import com.example.courseintg.model.Course;
import com.example.courseintg.model.CourseRequestModel;
import com.example.courseintg.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("/course")
    public Course getCourseByID(@RequestBody CourseRequestModel requestModel){
        return courseService.getCourse(requestModel);


    }

}
