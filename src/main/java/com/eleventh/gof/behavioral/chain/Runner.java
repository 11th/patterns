package com.eleventh.gof.behavioral.chain;

public class Runner {
    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();
        callCenter.answer("Звонок 1");
        callCenter.answer("Звонок 2");
        callCenter.answer("Звонок 3");
        callCenter.answer("Звонок 4");
    }
}
