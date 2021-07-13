package br.com.meli.diplomat.dto;

import br.com.meli.diplomat.entity.Subject;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SubjectDTO {

    @NotBlank
    @Size(max = 50, min = 8)
    @Pattern(regexp="^[A-Za-z]*$")
    private final String name;
    @NotNull
    private final double note;

    public SubjectDTO(String name, double note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public double getNote() {
        return note;
    }

    public static SubjectDTO convert(Subject subject){
        return new SubjectDTO(subject.getName(),subject.getNote());
    }

}
