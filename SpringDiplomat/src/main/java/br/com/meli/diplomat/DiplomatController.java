package br.com.meli.diplomat;

import br.com.meli.diplomat.entity.Student;
import br.com.meli.diplomat.sevices.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiplomatController {

    private final StudentService studentService;

    @Autowired
    public DiplomatController(StudentService studentService) {
        this.studentService =  studentService;
    }

    @PostMapping
    public String getDiplomat(@RequestBody Student s){

        return studentService.diplomat(1);

    }

}
