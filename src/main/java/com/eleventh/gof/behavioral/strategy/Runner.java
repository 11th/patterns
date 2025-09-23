package com.eleventh.gof.behavioral.strategy;

public class Runner {
    public static void main(String[] args) {
        Service service = new Service(new FirstStrategy());
        System.out.println(service.find());
        service.setFindStrategy(new SecondStrategy());
        System.out.println(service.find());
    }
}
