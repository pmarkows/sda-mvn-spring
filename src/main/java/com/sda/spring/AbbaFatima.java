package com.sda.spring;

import org.springframework.stereotype.Component;

public class AbbaFatima {

    private String message;

    public String getMessage() {
        System.out.println("Hello again " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
