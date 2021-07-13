package br.com.meli.diplomat.sevices;

import br.com.meli.diplomat.entity.Student;
import br.com.meli.diplomat.entity.Subject;
import br.com.meli.diplomat.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public String diplomat(long id){

        Student s = studentRepository.findById(id);

        double avg = calculateAverage(id);

        String msg = "Aqui está seu diploma " + s.getName() + ", sua média foi: " + String.format("%.2f",avg);

        return msg;

    }

    public String withHonors(long id){

        if(calculateAverage(id) >= 9.0){
            return "Parábens!";
        }
        return "Nice try";
    }

    public List<Subject> analyzeNotes(long id){

        return  studentRepository.findById(id).getSubjects();

    }

    public double calculateAverage(long id){

        return analyzeNotes(id).stream().mapToDouble(Subject::getNote).average().orElseThrow(RuntimeException::new);
    }



}
