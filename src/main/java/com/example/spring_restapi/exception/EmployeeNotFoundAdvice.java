package com.example.spring_restapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmployeeNotFoundAdvice {

    @ResponseBody // 응답 본문에 직접 렌더링
    @ExceptionHandler(EmployeeNotFoundException.class) // EmployeeNotFoundException을 던질 경우에만 응답하도록 어드바이스 구성
    @ResponseStatus(HttpStatus.NOT_FOUND) // http 404 Error를 발생
    public String employeeNotFoundHandler(EmployeeNotFoundException exception) {
        return exception.getMessage();
    }

}
