package com.module1.controllers;

import com.models.Student;
import com.module1.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@Controller
@RequestMapping("/module1")
public class StudentServlet {

    @Autowired
    StudentsService studentsService;

    @RequestMapping("/students")
    public @ResponseBody List<Student> getStudents(){
        return studentsService.getStudents();
    }


}
