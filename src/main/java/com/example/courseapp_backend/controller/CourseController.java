package com.example.courseapp_backend.controller;

import com.example.courseapp_backend.dao.CourseDao;
import com.example.courseapp_backend.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CourseController {
    @Autowired
    private CourseDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> Add(@RequestBody Course c){
        System.out.println(c.getCoursetitle().toString());
        System.out.println(c.getCoursedescription().toString());
        System.out.println(c.getCoursevenu().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getDate().toString());
        dao.save(c);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Course> View(){
        return (List<Course>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/search",consumes = "application/json",produces = "application/json")
    public List<Course> SearchCourse(@RequestBody Course c){
        String coursetitle=c.getCoursetitle();
        System.out.println(coursetitle);
        return (List<Course>) dao.SearchCourse(c.getCoursetitle());

    }
}
