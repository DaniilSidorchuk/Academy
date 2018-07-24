package com.models;

import com.models.enums.Faculty;

public class Student {
    private String name;
    private String surname;
    private Faculty faculty;
    private Group group;

    public Student(String name, String surname, Faculty faculty) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty=" + faculty +
                ", group=" + group +
                '}';
    }
}
