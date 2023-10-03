package object_oriented.encapsulation.prac2;

public class EncapsulationRental {
    private EncapsulationMovie encapsulationMovie;
    private int daysRented;

    public int getFrequentRenterPoints() {
        // 캡슐화 적용 o
        return encapsulationMovie.getFrequentRenterPoints(daysRented);
    }
}
