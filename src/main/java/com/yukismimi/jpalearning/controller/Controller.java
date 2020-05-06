package com.yukismimi.jpalearning.controller;

import com.yukismimi.jpalearning.entity.Clazz;
import com.yukismimi.jpalearning.entity.Course;
import com.yukismimi.jpalearning.entity.Student;
import com.yukismimi.jpalearning.repository.ClassRepository;
import com.yukismimi.jpalearning.repository.CourseRepository;
import com.yukismimi.jpalearning.repository.StudentRepository;
import com.yukismimi.jpalearning.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
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

    @GetMapping("findStudent")
    public List<Student> findStudent(@RequestParam(value = "id", required = false) Long id,
                                     @RequestParam(value = "name", required = false) String name,
                                     @RequestParam(value = "classId", required = false) Long classId) {
        ExampleMatcher exampleMatcher = ExampleMatcher.matchingAll()
                .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase());
        Student student = new Student();
        if (id != null) {
            student.setId(id);
        }
        if (name != null) {
            student.setName(name);
        }
        if (classId != null) {
            student.setClassId(classId);
        }
        Example<Student> example = Example.of(student, exampleMatcher);
        return studentRepository.findAll(example);
    }
}
