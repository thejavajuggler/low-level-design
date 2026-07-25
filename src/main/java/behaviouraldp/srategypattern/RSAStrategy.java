package behaviouraldp.srategypattern;

public class RSAStrategy implements EncryptStrategy {
    @Override
    public void encyrpt() {
        System.out.println("RSA Encryption Strategy");
    }
}
