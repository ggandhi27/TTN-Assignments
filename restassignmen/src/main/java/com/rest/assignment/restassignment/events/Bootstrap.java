package com.rest.assignment.restassignment.events;

import com.rest.assignment.restassignment.entity.Student;
import com.rest.assignment.restassignment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
public class Bootstrap {
    
    @Autowired
    StudentRepository studentRepository;
    
    @Bean
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasenames("i18n/messages");
        source.setUseCodeAsDefaultMessage(true);
        return source;
    }
    
    @EventListener (ContextRefreshedEvent.class)
    void setUp(){
        if(!studentRepository.findAll().iterator().hasNext()) {
            IntStream.range(0,10).forEach(e->{
                Student student = new Student();
                student.setName("student"+e);
                student.setAge(15+e);
                student.setCity("city"+e);
                student.setStandard(e);
                student.setPercentage(11.65*e);
                studentRepository.save(student);
            });
        }
    }
}
