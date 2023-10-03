package object_oriented.encapsulation.prac1;

import java.time.LocalDate;

public class NoEncapsulationAccount {
    private String membership;
    private LocalDate expDate;

    public String getMembership() {
        return membership;
    }

    public LocalDate getExpDate() {
        return expDate;
    }
}
