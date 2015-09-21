package ua.com.vhsoft.crman.mvc.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * This is error404 exception handler
 *
 * @author Vasyl Hoshovsky <vasyl.hoshovsky at vhsoft.com.ua>
 */
@ControllerAdvice
public class AdvisorController {

    @ExceptionHandler(NoHandlerFoundException.class)
    public String handle404(Exception ex) {
        return "error404";
    }
    
    @ExceptionHandler(Exception.class)
    public String handle500(Exception ex) {
        return "error500";
    }
}