package com.yukismimi.jpalearning.controller;

import com.yukismimi.jpalearning.entity.Clazz;
import com.yukismimi.jpalearning.entity.Course;
import com.yukismimi.jpalearning.entity.Student;
import com.yukismimi.jpalearning.repository.ClassRepository;
import com.yukismimi.jpalearning.repository.CourseRepository;
import com.yukismimi.jpalearning.repository.StudentRepository;
import com.yukismimi.jpalearning.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    ClassRepository classRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    ServiceImpl service;

    @GetMapping("listStudents")
    public List<Student> listStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("listClasses")
    public List<Clazz> listClasses() {
        return classRepository.findAll();
    }

    @GetMapping("listCourses")
    public List<Course> listCourses() {
        return courseRepository.findAll();
    }

    @DeleteMapping("deleteStudent")
    public void deleteStudent(@RequestParam("id") Long id) {
        studentRepository.deleteById(id);
    }
}
