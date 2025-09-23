package com.eleventh.gof.structural.decorator;

public class UserEmailDecorator implements Service {
    private final Service origin;
    private final Service emailService;

    public UserEmailDecorator(Service origin, Service emailService) {
        this.origin = origin;
        this.emailService = emailService;
    }

    @Override
    public void doSomething() {
        try {
            origin.doSomething();
            emailService.doSomething();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
