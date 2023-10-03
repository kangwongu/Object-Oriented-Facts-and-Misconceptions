package object_oriented.encapsulation;

import java.time.LocalDate;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // 캡슐화 적용 x
        NoEncapsulationAccount noEncapsulationAccount = new NoEncapsulationAccount();

        // 단순히 외부에서 객체 내부 필드를 바로 조회하는걸 막는 게 캡슐화가 아님
//        noEncapsulationAccount.getMembership();

        // 유지보수성이 낮다
        // TDA 원칙 & 디미터 법칙 위반
        if (noEncapsulationAccount.getMembership().equals("REGULAR") && noEncapsulationAccount.getExpDate().isAfter(LocalDate.now())) {
            // ...
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // 캡슐화 적용 o
        EncapsulationAccount encapsulationAccount = new EncapsulationAccount();

        // 유지보수성이 높다
        if (encapsulationAccount.hasRegularPermission()) {
            // ...
        }

    }
}
