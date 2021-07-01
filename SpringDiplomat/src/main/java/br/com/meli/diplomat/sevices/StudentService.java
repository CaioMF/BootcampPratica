package br.com.meli.diplomat.sevices;

import br.com.meli.diplomat.entity.Student;

public class StudentService {

    public static  String diplomat(Student s){

        String msg = "Aqui está seu diploma " + s.getName() + ", sua média foi: " + s.getAvg();

        if(s.getAvg() >= 9.0){
            return msg + " parábens!";
        }

        return msg;

    }

}
