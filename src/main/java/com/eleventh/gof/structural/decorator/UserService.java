package com.eleventh.gof.structural.decorator;

public class UserService implements Service {
    @Override
    public void doSomething() {
        System.out.println("Register new User");
    }
}
