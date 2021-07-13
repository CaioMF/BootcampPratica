package br.com.meli.diplomat;

import br.com.meli.diplomat.entity.Student;
import br.com.meli.diplomat.entity.Subject;
import br.com.meli.diplomat.repository.StudentRepository;
import br.com.meli.diplomat.sevices.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class CertificateServiceImplTest {

    private List<Subject> subjects;
    StudentRepository repository;
    StudentService studentService;

    @BeforeEach
    public void init(){

        subjects = new ArrayList<>();

        subjects.add(new Subject("Matematica", 7));
        subjects.add(new Subject("Portugues", 5));
        subjects.add(new Subject("Fisica", 10));

        repository = new StudentRepository(new Student(1,"Caio",subjects));
        studentService = new StudentService(repository);

    }

    @Test
    public void analyzeNotesTestEquals(){

        Assertions.assertEquals(subjects,studentService.analyzeNotes(1));

    }

    @Test
    public void analyzeNotesTestNotEquals(){

        List<Subject> newSubjects = new ArrayList<>();

        newSubjects.add(new Subject("Matematica", 7));
        newSubjects.add(new Subject("Portugues", 5));

        Assertions.assertNotEquals(newSubjects,studentService.analyzeNotes(1));

    }

    @Test
    public void calculateAverageTestEquals(){

        Assertions.assertEquals("7,33", String.format("%.2f",studentService.calculateAverage(1)));

    }

    @Test
    public void calculateAverageTestNotEquals(){

        Assertions.assertNotEquals("9,00", String.format("%.2f",studentService.calculateAverage(1)));

    }

    @Test
    public void writeDiplomaTestEquals(){
        Assertions.assertEquals("Aqui está seu diploma Caio, sua média foi: 7,33",studentService.diplomat(1));
    }

    @Test
    public void writeDiplomaTestNotEquals(){
        Assertions.assertNotEquals("Aqui está seu diploma, sua média foi:",studentService.diplomat(1));
    }

    @Test
    public void withHonorsTestEquals(){
        Assertions.assertEquals("Nice try",studentService.withHonors(1));
    }

    @Test
    public void withHonorsTestNotEquals(){
        Assertions.assertNotEquals("Parabens",studentService.withHonors(1));
    }



}
