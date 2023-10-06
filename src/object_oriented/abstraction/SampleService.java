package object_oriented.abstraction;

import object_oriented.abstraction.abstrac.Notifier;
import object_oriented.abstraction.factory.NotifierFactory;

public class SampleService {

//    private final EmailNotifier emailNotifier;
//    private final SmsNotifier smsNotifier;

    public void sendNotify(String type) {
        // 추상화 o,
        // kakao 알림톡이 추가되면? 수정이 필요없다 -> Notifier 인터페이스의 구현체면 누구든 참여할 수 있다
        Notifier notifier = NotifierFactory.instance().getNotifier(type);
        notifier.send();
    }

}
