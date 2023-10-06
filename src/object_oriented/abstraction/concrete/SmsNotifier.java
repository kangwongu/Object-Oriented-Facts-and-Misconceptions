package object_oriented.abstraction.concrete;

import object_oriented.abstraction.abstrac.Notifier;

public class SmsNotifier implements Notifier {

    @Override
    public void send() {
        System.out.println("SMS 전송");
    }
}
