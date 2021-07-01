package br.com.meli.diplomat.entity;

import java.util.List;

public class Student {

    private String name;
    private List<Subject> subjects;

    public Student(String name, List<Subject> subjects) {
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

    public double getAvg(){
        return subjects.stream().mapToDouble(Subject::getGrade).average().orElseThrow(RuntimeException::new);
    }
}
