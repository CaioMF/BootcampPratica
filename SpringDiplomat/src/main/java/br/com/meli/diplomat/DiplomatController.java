package br.com.meli.diplomat;

import br.com.meli.diplomat.dto.SubjectDTO;
import br.com.meli.diplomat.entity.Student;
import br.com.meli.diplomat.sevices.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DiplomatController {

    private final CertificateService certificateService;

    @Autowired
    public DiplomatController(CertificateService certificateService) {
        this.certificateService = certificateService;
    }

    @PostMapping
    public String getDiplomat(@Valid @RequestBody Student s){

        return certificateService.diplomat(s.getId());

    }

    @GetMapping
    public List<SubjectDTO> getSubject(@RequestBody Student s){

        return certificateService.analyzeNotes(s.getId()).stream().map(SubjectDTO::convert).collect(Collectors.toList());

    }

}
