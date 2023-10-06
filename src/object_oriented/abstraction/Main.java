package object_oriented.abstraction;

public class Main {
    public static void main(String[] args) {
//        Notifier notifier = NotifierFactory.instance().getNotifier("sms");
        SampleService service = new SampleService();

        service.sendNotify("kakao");
    }
}
