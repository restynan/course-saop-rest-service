package com.example.courseintg.config;

import com.example.courseintg.ObjectFactory;
import com.example.courseintg.service.CourseClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CourseConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setClassesToBeBound(ObjectFactory.class);
        return marshaller;
    }

    @Bean
    public CourseClient courseClient(Jaxb2Marshaller marshaller) {
        CourseClient courseClient = new CourseClient ();
        courseClient.setDefaultUri("http://localhost:8080/ws");
        courseClient.setMarshaller(marshaller);
        courseClient.setUnmarshaller(marshaller);

        return courseClient;
    }



}
