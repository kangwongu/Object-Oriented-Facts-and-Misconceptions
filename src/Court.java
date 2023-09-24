public class Court {
    public static void main(String[] args) {
        HatSeller hatSeller = new HatSeller();
        WhiteRabbit whiteRabbit = new WhiteRabbit(hatSeller);
        King king = new King(whiteRabbit);

        // 1. 왕에게 재판할 것을 요청한다
        king.makeTrial();
    }
}
