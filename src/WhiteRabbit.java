public class WhiteRabbit {

    HatSeller hatSeller;

    public WhiteRabbit(HatSeller hatSeller) {
        this.hatSeller = hatSeller;
    }

    @Override
    public String toString() {
        return "WhiteRabbit";
    }

    // 3. 토끼는 왕의 요청에 응답해 증인을 불러온다
    public HatSeller bringWitness() {
        System.out.println("3. " + this + " -> " + hatSeller + ": 증인석에 입장하라");
        System.out.println(hatSeller + " 입장합니다");
        return hatSeller;
    }
}
