package object_oriented.encapsulation.prac2;

public class NoEncapsulationRental {
    private NoEncapsulationMovie noEncapsulationMovie;
    private int daysRented;

    public int getFrequentRenterPoints() {
        // 캡슐화 적용 x
        // TDA 위반 -> Movie에게 위임
        if (noEncapsulationMovie.getPriceCode() == NoEncapsulationMovie.NEW_RELEASE && daysRented > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
