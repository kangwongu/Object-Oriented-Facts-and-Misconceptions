package object_oriented.abstraction;

public class SampleService {

    private final EmailNotifier emailNotifier;
    private final SmsNotifier smsNotifier;

    public SampleService(EmailNotifier emailNotifier, SmsNotifier smsNotifier) {
        this.emailNotifier = emailNotifier;
        this.smsNotifier = smsNotifier;
    }

    public void sendNotify(String type) {
        // 추상화 x, 구현체 직접 의존중
        // kakao 알림톡이 추가되면? 수정이 필요하다 -> 요구사항 변경 시, 수정 불가피
        if (type.equals("email")) {
            emailNotifier.send();
        } else if (type.equals("sms")) {
            smsNotifier.send();
        }
    }

}
