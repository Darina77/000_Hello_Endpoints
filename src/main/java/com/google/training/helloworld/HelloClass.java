package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
    public HelloClass(String name, int period) {
        message = "";
        for (int i = 0; i < period; i++) {
            message+="Hello " + name + "! ";
        }
    }

    public String getMessage() {
        return message;
    }
}
