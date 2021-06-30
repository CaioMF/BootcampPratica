package br.com.meli.morse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeController {

    @GetMapping(path = "/convert/{value}")
    public String convert(@PathVariable String value){

        return "A tradução do código é: " + CodeTranslator.translate(value);

    }
}
