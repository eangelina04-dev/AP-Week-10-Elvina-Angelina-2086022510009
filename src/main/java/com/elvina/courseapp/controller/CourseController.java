package com.elvina.courseapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.elvina.courseapp.model.Course;

@Controller
public class CourseController {

    @GetMapping("/")
    public String home(Model model) {

        List<Course> courses = new ArrayList<>();

        courses.add(new Course(
                "Advanced Programming",
                "Learn Java and Object-Oriented Programming",
                "Informatics Course",
                "/images/Advanced Programming.jpg"
        ));

        courses.add(new Course(
                "Data Structure",
                "Learn list, array, tree, and algorithms",
                "Informatics Course",
                "/images/Data Structure.jpg" 
        ));

        courses.add(new Course(
                "Web Programming",
                "Learn HTML, CSS, and JavaScript",
                "Informatics Course",
                "/images/Web Programming.jpg"
        ));

        courses.add(new Course(
                "Database",
                "Learn database management and MySQL",
                "Informatics Course",
                "/images/Database.jpg"
        ));

        courses.add(new Course(
                "Civic Education & Nation Building",
                "Learn how to become a responsible and law-abiding citizen in Indonesia",
                "General Course",
                "/images/Civic & Menjadi Indonesia.jpg"
        ));

        courses.add(new Course(
                "Entrepreneurial Venture & Creation",
                "Learn how to build a startup with many limitations",
                "General Course",
                "/images/EVCE.jpg"
        ));

        model.addAttribute("courses", courses);

        return "index";
    }
}