package behaviouraldp.srategypattern;

public class Email extends Notification{

    public Email(EncryptStrategy encryptStrategy, CompressionStrategy compressionStrategy) {
        super(encryptStrategy, compressionStrategy);
    }

    @Override
    void send() {
        System.out.println("Email Notification");
    }
}
