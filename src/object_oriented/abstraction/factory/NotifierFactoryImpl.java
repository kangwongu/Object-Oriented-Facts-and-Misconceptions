package object_oriented.abstraction.factory;

import object_oriented.abstraction.abstrac.Notifier;
import object_oriented.abstraction.concrete.EmailNotifier;
import object_oriented.abstraction.concrete.KakaoNotifier;
import object_oriented.abstraction.concrete.SmsNotifier;

public class NotifierFactoryImpl implements NotifierFactory {

    @Override
    public Notifier getNotifier(String type) {
        if (type.equals("email")) {
            return new EmailNotifier();
        } else if (type.equals("sms")) {
            return new SmsNotifier();
        } else if (type.equals("kakao")) {
            return new KakaoNotifier();
        }
        return null;
    }
}
