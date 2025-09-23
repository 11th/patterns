package com.eleventh.gof.behavioral.strategy;

public class FirstStrategy implements Strategy {
    @Override
    public String getData() {
        return "First strategy";
    }
}
