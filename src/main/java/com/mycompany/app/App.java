package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

<<<<<<< HEAD
    private final String message = "Hello Verizon";
=======
    private final String message = "Hello Devops";
>>>>>>> 8e7fc6d2c4946f981a2fdd3f050956598124860f

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
