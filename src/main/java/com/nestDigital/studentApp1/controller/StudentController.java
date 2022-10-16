package com.nestDigital.studentApp1.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {
    @GetMapping("/")
    public String homePage(){
        return "Welcome to My Home Page";
    }
    @GetMapping("/contact")
    public String Contact(){
        return "this my Contact page";
    }
}
