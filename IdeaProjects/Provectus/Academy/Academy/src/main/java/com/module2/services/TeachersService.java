package com.module2.services;

import com.module2.dao.TeachersDao;
import com.models.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachersService {
    @Autowired
    private TeachersDao teachers;

    public List<Teacher> getTeachersList(){
       return teachers.getTeachers();
    }

}
