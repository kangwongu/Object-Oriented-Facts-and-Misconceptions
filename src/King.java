public class King {


//    public void makeTrial() {
//        callWitness(new WhiteRabbit(new HatSeller()));
//        testifyToWitness(new HatSeller());
//    }

    public HatSeller callWitness(WhiteRabbit whiteRabbit) {
        System.out.println("왕 -> " + whiteRabbit +": 목격자를 불러오라");
        // 2. 토끼는 왕의 요청에 응답해서 증인을 불러온다
        return whiteRabbit.bringWitness();
    }

    public void testifyToWitness(HatSeller hatSeller) {
        System.out.println("왕 -> " + hatSeller + ": 증언하라");
        // 4. 모자장수(증인)은 왕의 요청에 응답해서 증언한다
        hatSeller.testify();
    }


}
