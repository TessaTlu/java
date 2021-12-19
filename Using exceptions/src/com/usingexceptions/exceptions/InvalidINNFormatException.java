package com.usingexceptions.exceptions;

public class InvalidINNFormatException extends Exception {

    public InvalidINNFormatException (String message) {
        super(message);
    }
}
