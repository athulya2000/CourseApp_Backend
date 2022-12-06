package com.example.courseapp_backend.controller;

import com.example.courseapp_backend.dao.CourseDao;
import com.example.courseapp_backend.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String Add(@RequestBody Course c){
        System.out.println(c.getCoursetitle().toString());
        System.out.println(c.getCoursedescription().toString());
        System.out.println(c.getCoursevenu().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getDate().toString());
        dao.save(c);
        return "course added successfully";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Course> View(){
        return (List<Course>) dao.findAll();
    }
}
