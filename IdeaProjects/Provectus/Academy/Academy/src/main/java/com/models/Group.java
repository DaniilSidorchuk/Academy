package com.models;

import java.util.LinkedList;
import java.util.List;

public class Group {

    private int id;
    private List<Student> students;
    private Student groupHead;

    public Group(int id, Student groupHead) {
        this.id = id;
        this.groupHead = groupHead;
        students = new LinkedList<Student>();
        students.add(groupHead);
    }

    public int getId() {
        return id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getGroupHead() {
        return groupHead;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", students=" + students +
                ", groupHead=" + groupHead +
                '}';
    }
}
