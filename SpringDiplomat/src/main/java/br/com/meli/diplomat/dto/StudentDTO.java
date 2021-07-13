package br.com.meli.diplomat.dto;

import br.com.meli.diplomat.entity.Student;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDTO {

    @NotBlank
    @Size(max = 50, min = 8)
    @Pattern(regexp="^[A-Za-z]*$")
    private String name;
    @NotNull
    private List<SubjectDTO> subjectDTOS;

    public StudentDTO(String name, List<SubjectDTO> subjectDTOS) {
        this.name = name;
        this.subjectDTOS = subjectDTOS;
    }

    public List<SubjectDTO> getSubjects() {
        return subjectDTOS;
    }

    public void setSubjects(List<SubjectDTO> subjectDTOS) {
        this.subjectDTOS = subjectDTOS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static StudentDTO conver(Student student){
        return new StudentDTO(student.getName(), student.getSubjects().stream().map(SubjectDTO::convert).collect(Collectors.toList()));
    }



}
