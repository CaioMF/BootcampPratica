package br.meli.com.linktrack.exception;

import br.meli.com.linktrack.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class ExeceptionAdiviceHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<ErrorDTO> defaultHendler(NoSuchElementException e){

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorDTO(HttpStatus.NOT_FOUND.value(),"(INVESTIGAR REDIRECT)"));

    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorDTO> defaultHendler(IllegalArgumentException e){

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorDTO(HttpStatus.NOT_FOUND.value(),e.getMessage()));

    }
}
