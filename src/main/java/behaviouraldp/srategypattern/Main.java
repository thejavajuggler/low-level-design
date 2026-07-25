package behaviouraldp.srategypattern;

public class Main {

    public static void main(String[] args) {

        Notification notification = new Sms(new AESEncryptStrategy(), new GZIPStrategy());
        notification.send();
        notification.encrypt();
        notification.compress();

        Notification emailNotification = new Email(new AESEncryptStrategy(), new ZIPStrategy());
        emailNotification.send();;
        emailNotification.encrypt();
        emailNotification.compress();
    }
}
