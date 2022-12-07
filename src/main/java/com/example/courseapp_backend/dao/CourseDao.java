package com.example.courseapp_backend.dao;

import com.example.courseapp_backend.model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Queue;

public interface CourseDao extends CrudRepository<Course,Integer> {
    @Query(value="SELECT `id`, `coursedescription`, `coursetitle`, `coursevenu`, `date`, `duration` FROM `course` WHERE `coursetitle`= :coursetitle",nativeQuery = true)
    List<Course> SearchCourse(@Param("coursetitle") String coursetitle);
}
