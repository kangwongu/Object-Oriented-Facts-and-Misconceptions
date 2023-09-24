package chapter04.judge;

import chapter04.rabbit.WhiteRabbit;
import chapter04.witness.Witness;

public class King implements Judge {

    public WhiteRabbit whiteRabbit;

    public King(WhiteRabbit whiteRabbit) {
        this.whiteRabbit = whiteRabbit;
    }

    @Override
    public String toString() {
        return "King";
    }

    @Override
    public void makeTrial() {
        System.out.println("1. ... -> " + this + ": 재판하라");

        // 2. 토끼에게 목격자를 불러오라고 요청한다
        System.out.println("2. " + this + " -> " + whiteRabbit +": 목격자를 불러오라");
        Witness witness = whiteRabbit.bringWitness();

        // 4. 불러온 증인에게 증언할 것은 요청한다
        System.out.println("4. " + this + " -> " + witness + ": 증언하라");
        witness.testify();
    }

}
