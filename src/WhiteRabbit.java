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
        System.out.println("토끼 -> " + hatSeller + ": 증인석에 입장하라");
        System.out.println(hatSeller + " 입장합니다");
        return hatSeller;
    }
}
