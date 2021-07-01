package br.com.meli.diplomat;

import br.com.meli.diplomat.entity.Student;
import br.com.meli.diplomat.sevices.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiplomatController {

    @PostMapping
    public String getDiplomat(@RequestBody Student s){

        return StudentService.diplomat(s);

    }

}
