package com.eleventh.gof.behavioral.chain;

public class HumanOperator implements Operator {
    private final String name;
    private boolean onCall;
    private Operator next;

    public HumanOperator(String name) {
        this(name, null);
    }

    public HumanOperator(String name, Operator next) {
        this.name = name;
        this.next = next;
    }

    @Override
    public boolean isOnCall() {
        return onCall;
    }

    @Override
    public void answer(String call) {
        if (!onCall) {
            System.out.printf("%s: Оператор %s слушает%n", call, name);
            onCall = true;
        } else {
            if (next != null) {
                System.out.println("Перевод на следующего оператора...");
                next.answer(call);
            }
        }
    }

    @Override
    public void setNextOperator(Operator operator) {
        this.next = operator;
    }
}
