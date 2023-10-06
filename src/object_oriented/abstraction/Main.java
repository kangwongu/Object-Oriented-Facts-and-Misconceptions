package object_oriented.abstraction;

public class Main {
    public static void main(String[] args) {
        SampleService service = new SampleService(new EmailNotifier(), new SmsNotifier());

        service.sendNotify("sms");
    }
}
