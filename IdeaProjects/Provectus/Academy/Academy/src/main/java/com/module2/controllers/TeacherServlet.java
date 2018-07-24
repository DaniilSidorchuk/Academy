package com.module2.controllers;

import com.models.Teacher;
import com.module2.services.TeachersService;
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
@RequestMapping("/module2")
public class TeacherServlet  {

    @Autowired
    TeachersService teachersService;

    @RequestMapping("/teachers")
    public @ResponseBody List<Teacher> getTeachers(){
        return teachersService.getTeachersList();
    }

}
