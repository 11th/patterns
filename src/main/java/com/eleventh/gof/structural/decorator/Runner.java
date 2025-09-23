package com.eleventh.gof.structural.decorator;

public class Runner {
    public static void main(String[] args) {
        Service userService = new UserService();
        Service emailService = new EmailService();
        UserEmailDecorator decorator = new UserEmailDecorator(userService, emailService);
        decorator.doSomething();
    }
}
