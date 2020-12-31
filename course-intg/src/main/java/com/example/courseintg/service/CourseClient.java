package com.example.courseintg.service;

import com.example.courseintg.GetCourseDetailsRequest;
import com.example.courseintg.GetCourseDetailsResponse;
import com.example.courseintg.model.CourseRequestModel;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
public class CourseClient extends WebServiceGatewaySupport {



    public GetCourseDetailsResponse getCourseResponse(CourseRequestModel requestModel) {
       GetCourseDetailsRequest request = createRequest(requestModel);

        return (GetCourseDetailsResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws", request);
    }

    private GetCourseDetailsRequest createRequest(CourseRequestModel requestModel) {
        GetCourseDetailsRequest req= new GetCourseDetailsRequest();
        req.setId(requestModel.getId());
        return req;


    }
}
