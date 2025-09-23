package com.eleventh.gof.behavioral.strategy;

public class Service {
    private Strategy findStrategy;

    public Service(Strategy findStrategy) {
        this.findStrategy = findStrategy;
    }

    public void setFindStrategy(Strategy findStrategy) {
        this.findStrategy = findStrategy;
    }

    public String find() {
        return findStrategy.getData();
    }
}
