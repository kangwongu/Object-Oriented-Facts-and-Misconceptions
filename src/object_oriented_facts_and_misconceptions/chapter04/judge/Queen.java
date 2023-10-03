package object_oriented_facts_and_misconceptions.chapter04.judge;

import object_oriented_facts_and_misconceptions.chapter04.rabbit.WhiteRabbit;
import object_oriented_facts_and_misconceptions.chapter04.witness.Witness;

public class Queen implements Judge {

    public WhiteRabbit whiteRabbit;

    public Queen(WhiteRabbit whiteRabbit) {
        this.whiteRabbit = whiteRabbit;
    }

    @Override
    public String toString() {
        return "Queen";
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
