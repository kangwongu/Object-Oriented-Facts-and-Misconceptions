package chapter04;

import chapter04.judge.Judge;
import chapter04.judge.King;
import chapter04.rabbit.WhiteRabbit;
import chapter04.witness.HatSeller;
import chapter04.witness.Witness;

public class Court {
    public static void main(String[] args) {
        // 왕 - 토끼 - 모자장수
        Witness witness = new HatSeller();
        WhiteRabbit whiteRabbit = new WhiteRabbit(witness);
        Judge judge = new King(whiteRabbit);

        // 1. 판사에게 재판할 것을 요청한다
        judge.makeTrial();

        // 왕 - 토끼 - 요리사
//        Witness witness = new Chef();
//        WhiteRabbit whiteRabbit = new WhiteRabbit(witness);
//        Judge .judge = new King(whiteRabbit);
//
//        // 1. 판사에게 재판할 것을 요청한다
//        judge.makeTrial();

        // 여왕 - 토끼 - 앨리스
//        Witness witness = new Alice();
//        WhiteRabbit whiteRabbit = new WhiteRabbit(witness);
//        Judge judge = new Queen(whiteRabbit);
//
//        // 1. 판사에게 재판할 것을 요청한다
//        judge.makeTrial();
    }
}
