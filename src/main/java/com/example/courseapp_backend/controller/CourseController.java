package com.example.courseapp_backend.controller;

import com.example.courseapp_backend.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String Add(@RequestBody Course c){
        System.out.println(c.getCoursetitle().toString());
        System.out.println(c.getCoursedescription().toString());
        System.out.println(c.getCoursevenu().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getDate().toString());
        return "course added successfully";
    }
    @GetMapping("/viewall")
    public String View(){
        return "Welcome to course view all page";
    }
}
