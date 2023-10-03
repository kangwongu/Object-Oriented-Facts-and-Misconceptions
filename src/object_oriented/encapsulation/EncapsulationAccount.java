package object_oriented.encapsulation;

import java.time.LocalDate;
import java.util.Objects;

public class EncapsulationAccount {
    private String membership;
    private LocalDate expDate;

    // 캡슐화
    public Boolean hasRegularPermission() {
        // Regular 권한 판단의 변화가 생기면, 이 메소드만 변경하면 된다
        return Objects.equals(membership, "REGULAR") && expDate.isAfter(LocalDate.now());
    }

    public String getMembership() {
        return membership;
    }

    public LocalDate getExpDate() {
        return expDate;
    }
}
