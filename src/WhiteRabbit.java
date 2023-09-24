public class WhiteRabbit {

    HatSeller hatSeller;

    public WhiteRabbit(HatSeller hatSeller) {
        this.hatSeller = hatSeller;
    }

    @Override
    public String toString() {
        return "WhiteRabbit";
    }

    public HatSeller bringWitness() {
        System.out.println("3. " + this + " -> " + hatSeller + ": 증인석에 입장하라");
        System.out.println(hatSeller + " 입장합니다");
        // 3. 토끼는 왕의 요청에 응답해 증인에게 출석을 요청한다
        return hatSeller.comeToCourt();
    }
}
