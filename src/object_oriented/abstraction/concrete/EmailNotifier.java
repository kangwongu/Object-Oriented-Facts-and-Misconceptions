package object_oriented.abstraction.concrete;

import object_oriented.abstraction.abstrac.Notifier;

public class EmailNotifier implements Notifier {

    @Override
    public void send() {
        System.out.println("이메일 전송");
    }
}
