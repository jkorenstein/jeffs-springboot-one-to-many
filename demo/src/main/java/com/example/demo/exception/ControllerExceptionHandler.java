package com.example.demo.exception;

public class ControllerExceptionHandler {
    // This class can be used to handle exceptions globally in the application.
    // It can contain methods annotated with @ExceptionHandler to handle specific exceptions.
    // For example, you can handle ResourceNotFoundException here and return a custom error response.

    // Example method:
    // @ExceptionHandler(ResourceNotFoundException.class)
    // public ResponseEntity<ErrorMessage> handleResourceNotFoundException(ResourceNotFoundException ex) {
    //     ErrorMessage errorMessage = new ErrorMessage(ex.getMessage());
    //     return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    // }
}
