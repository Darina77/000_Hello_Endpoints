package com.google.training.helloworld;

/**
 * Created by Darina on 25.02.2017.
 */
public class ByeClass {

    public String message = "Hello World";

    public ByeClass () {
    }

    public ByeClass (String name) {
        this.message = "Bye " + name + "!";
    }

    public String getMessage() {
        return message;
    }
}
