package chapter04.witness;

public class HatSeller implements Witness {

    @Override
    public String toString() {
        return "HatSeller";
    }

    @Override
    public void testify() {
        System.out.println(this + " 증언합니다.");
    }

    @Override
    public Witness comeToCourt() {
        return this;
    }
}
