package object_oriented_facts_and_misconceptions.chapter04.rabbit;

import object_oriented_facts_and_misconceptions.chapter04.witness.Witness;

public class WhiteRabbit {

    public Witness witness;

    public WhiteRabbit(Witness witness) {
        this.witness = witness;
    }

    @Override
    public String toString() {
        return "WhiteRabbit";
    }

    public Witness bringWitness() {
        System.out.println("3. " + this + " -> " + witness + ": 증인석에 입장하라");
        System.out.println(witness + " 입장합니다");
        // 3. 토끼는 왕의 요청에 응답해 증인에게 출석을 요청한다
        return witness.comeToCourt();
    }
}
