package com.eleventh.gof.structural.decorator;

public class EmailService implements Service {
    @Override
    public void doSomething() {
        System.out.println("Send email to User");
    }
}
