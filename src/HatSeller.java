public class HatSeller {

    @Override
    public String toString() {
        return "HatSeller";
    }

    public void testify() {
        System.out.println(this + " 증언합니다.");
    }

    public HatSeller comeToCourt() {
        return this;
    }
}
