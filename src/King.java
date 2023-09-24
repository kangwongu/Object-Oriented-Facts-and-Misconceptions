public class King {

    WhiteRabbit whiteRabbit;

    public King(WhiteRabbit whiteRabbit) {
        this.whiteRabbit = whiteRabbit;
    }

    @Override
    public String toString() {
        return "King";
    }

    public void makeTrial() {
        System.out.println("1. ... -> " + this + ": 재판하라");

        // 2. 토끼에게 목격자를 불러오라고 요청한다
        System.out.println("2. " + this + " -> " + whiteRabbit +": 목격자를 불러오라");
        HatSeller hatSeller = whiteRabbit.bringWitness();

        // 4. 불러온 증인에게 증언할 것은 요청한다
        System.out.println("4. " + this + " -> " + hatSeller + ": 증언하라");
        hatSeller.testify();
    }

}
