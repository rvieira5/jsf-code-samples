package br.com.rvieira5.bean;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import jakarta.annotation.PostConstruct;

@Named
@RequestScoped
public class HelloWorldBean {

    private String message;

    @PostConstruct
    public void initialize() {
        message = "Hello world";
    }

    public String getMessage() {
        return message;
    }

}
