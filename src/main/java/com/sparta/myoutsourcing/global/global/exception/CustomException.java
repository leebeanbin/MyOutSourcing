package com.sparta.myoutsourcing.global.global.exception;

import com.sparta.codeplanet.global.enums.ErrorType;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {

    private String result;
    private ErrorType errorType;

    public CustomException(ErrorType errorType) {
        this.result = "ERROR";
        this.errorType = errorType;
    }
}