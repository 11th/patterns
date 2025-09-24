package com.eleventh.gof.behavioral.chain;

public interface Operator {
    boolean isOnCall();
    void answer(String call);
    void setNextOperator(Operator operator);
}
