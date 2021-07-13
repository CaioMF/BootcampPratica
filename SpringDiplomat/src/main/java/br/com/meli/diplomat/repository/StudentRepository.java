package br.com.meli.diplomat.repository;

import br.com.meli.diplomat.entity.Student;
import br.com.meli.diplomat.entity.Subject;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentRepository {

    private List<Student> students;

    public StudentRepository(List<Student> students) {
        this.students = students;
    }

    public StudentRepository(Student student){
        this.students = Collections.singletonList(student);
    }

    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    public Student findById(long id){
        return students.stream().filter( s -> s.getId() == id).findFirst().orElseThrow(NoSuchElementException::new);
    }



}
