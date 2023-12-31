package com.example.OnlineOrder.rest.castomExeption;

import com.example.OnlineOrder.dto.ErrorResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class NotFindExeptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorResponseDTO> handlerExeption404(NotFIndExeption ext){
        ErrorResponseDTO error = new ErrorResponseDTO();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(ext.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        return  new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }



}
