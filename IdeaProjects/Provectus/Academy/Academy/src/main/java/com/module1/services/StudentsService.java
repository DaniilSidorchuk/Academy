package com.module1.services;

import com.module1.dao.GroupsDao;
import com.models.Group;
import com.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
public class StudentsService {
    @Autowired
    private GroupsDao groupsDao;

    public LinkedList<Student> getStudents(){
        LinkedList<Student> list = new LinkedList<Student>();
        for (Group group : groupsDao.getGroups()) {
            list.addAll(group.getStudents());
        }
        return list;
    }

}
