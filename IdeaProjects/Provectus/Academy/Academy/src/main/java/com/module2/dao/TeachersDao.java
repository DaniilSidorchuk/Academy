package com.module2.dao;

import com.models.Teacher;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class TeachersDao {
    List<Teacher> teachers =  Arrays.asList(new Teacher("Melkov", "Math"),
            new Teacher ("Labzina", "Russian"));

    public List<Teacher> getTeachers() {
        return teachers;
    }
}
