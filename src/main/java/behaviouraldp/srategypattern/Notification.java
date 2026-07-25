package behaviouraldp.srategypattern;

public abstract class Notification {

    EncryptStrategy encryptStrategy;
    CompressionStrategy compressionStrategy;

    public Notification(EncryptStrategy encryptStrategy, CompressionStrategy compressionStrategy) {
        this.encryptStrategy = encryptStrategy;
        this.compressionStrategy = compressionStrategy;
    }

    abstract void send();

    void encrypt(){
       encryptStrategy.encyrpt();
    }

    void compress() {
        compressionStrategy.compress();
    }

}
