package com.eleventh.gof.behavioral.chain;

public class CallCenter {
    private final Operator first;

    public CallCenter() {
        Operator robot = new RobotOperator();
        Operator galya = new HumanOperator("Галя");
        Operator vika = new HumanOperator("Вика");

        vika.setNextOperator(galya);
        galya.setNextOperator(robot);

        this.first = vika;
    }

    public void answer(String call) {
        first.answer(call);
    }
}
