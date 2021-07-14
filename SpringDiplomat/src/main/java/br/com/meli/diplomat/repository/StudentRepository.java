package br.com.meli.diplomat.repository;

import br.com.meli.diplomat.entity.Student;
import br.com.meli.diplomat.entity.Subject;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentRepository{

    private List<Student> students;

    List<Subject> subjects = new ArrayList<>();


    public StudentRepository() {

        subjects.add(new Subject("Matematica", 7));
        subjects.add(new Subject("Portugues", 5));
        subjects.add(new Subject("Fisica", 10));
        Student student =  new Student(1,"Caio",subjects);
        this.students= Collections.singletonList(student);

    }

    public StudentRepository(Student student){
        this.students = Collections.singletonList(student);
    }

    public Student findById(long id){

        return students.stream().filter( s -> s.getId() == id).findFirst().orElseThrow(NoSuchElementException::new);
    }



}
