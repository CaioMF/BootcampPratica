package br.com.meli.diplomat.entity;

import java.util.List;

public class Student {

    private long id;
    private String name;
    private List<Subject> subjects;

    public Student(long id,String name, List<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
