package com.eleventh.gof.behavioral.chain;

public class RobotOperator implements Operator {
    @Override
    public boolean isOnCall() {
        return false;
    }

    @Override
    public void answer(String call) {
        System.out.printf("%s: Робот оператор слушает%n", call);
    }

    @Override
    public void setNextOperator(Operator operator) {
        System.out.println("Нет свободных операторов");
    }
}
