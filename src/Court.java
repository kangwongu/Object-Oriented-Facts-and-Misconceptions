public class Court {
    public static void main(String[] args) {
        King king = new King();
        HatSeller hatSeller = new HatSeller();
        WhiteRabbit whiteRabbit = new WhiteRabbit(hatSeller);

        // 1. 왕은 토끼에게 모자장수(증인)을 불러오라고 요청
        HatSeller witness = king.callWitness(whiteRabbit);
        // 3. 왕은 모자장수(증인)에게 증언하라고 요청
        king.testifyToWitness(witness);
    }
}
