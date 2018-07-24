package com.models;

import java.util.LinkedList;
import java.util.List;

public class Teacher {
    private String surname;
    private String object;
    private List<Group> groups;

    public Teacher(String surname, String object) {
        this.surname = surname;
        this.object = object;
        groups = new LinkedList<Group>();
    }

    public String getSurname() {
        return surname;
    }

    public String getObject() {
        return object;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group group){
        this.groups.add(group);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "surname='" + surname + '\'' +
                ", object='" + object + '\'' +
                ", groups=" + groups +
                '}';
    }
}
