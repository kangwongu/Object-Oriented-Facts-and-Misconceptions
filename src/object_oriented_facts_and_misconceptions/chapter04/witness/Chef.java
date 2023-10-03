package object_oriented_facts_and_misconceptions.chapter04.witness;

public class Chef implements Witness {

    @Override
    public String toString() {
        return "Chef";
    }

    @Override
    public Witness comeToCourt() {
        return this;
    }

    @Override
    public void testify() {
        System.out.println(this + " 싫은데요.");
    }
}
