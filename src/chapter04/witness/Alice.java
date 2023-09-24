package chapter04.witness;

public class Alice implements Witness {

    @Override
    public String toString() {
        return "Alice";
    }

    @Override
    public Witness comeToCourt() {
        return this;
    }

    @Override
    public void testify() {
        System.out.println(this + " 증언할게요.");
    }
}
