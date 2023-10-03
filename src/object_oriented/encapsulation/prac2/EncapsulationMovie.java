package object_oriented.encapsulation.prac2;

public class EncapsulationMovie {
    public static int NEW_RELEASE = 1;
    public static int REGULAR = 0;

    private int priceCode;

    public int getPriceCode() {
        return priceCode;
    }

    public int getFrequentRenterPoints(int daysRented) {
        if (priceCode == NoEncapsulationMovie.NEW_RELEASE && daysRented > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
