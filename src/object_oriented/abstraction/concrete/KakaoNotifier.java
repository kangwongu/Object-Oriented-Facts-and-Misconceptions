package object_oriented.abstraction.concrete;

import object_oriented.abstraction.abstrac.Notifier;

public class KakaoNotifier implements Notifier {

    @Override
    public void send() {
        System.out.println("카카오 알림톡 전송");
    }
}
