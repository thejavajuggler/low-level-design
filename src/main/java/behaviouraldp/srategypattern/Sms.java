package behaviouraldp.srategypattern;

public class Sms extends Notification{
    public Sms(EncryptStrategy encryptStrategy, CompressionStrategy compressionStrategy) {
        super(encryptStrategy, compressionStrategy);
    }

    @Override
    public void send() {
        System.out.println("SMS Notification");
    }

}
