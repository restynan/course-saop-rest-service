package com.example.courseintg.service;

import com.example.courseintg.GetCourseDetailsResponse;
import com.example.courseintg.model.Course;
import com.example.courseintg.model.CourseRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    CourseClient courseClient;
    public Course getCourse(CourseRequestModel requestModel){
        GetCourseDetailsResponse response= courseClient.getCourseResponse(requestModel);
        Course course = new Course();
        course.setId(response.getCourseDetails().getId());
        course.setName(response.getCourseDetails().getName());
        course.setDescription(response.getCourseDetails().getDescription());
        return course;
    }
}
