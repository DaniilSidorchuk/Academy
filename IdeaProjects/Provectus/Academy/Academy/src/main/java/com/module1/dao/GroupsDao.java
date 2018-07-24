package com.module1.dao;

import com.models.Group;
import com.models.Student;
import com.models.enums.Faculty;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class GroupsDao {
    List<Group> groups =  Arrays.asList(new Group(909, new Student("Alex", "Berg", Faculty.HUM)),
            new Group(112, new Student("Emil", "Varapaev", Faculty.TECH)));

    public List<Group> getGroups() {
        return groups;
    }
}
