package behaviouraldp.srategypattern;

public class ZIPStrategy implements CompressionStrategy{
    @Override
    public void compress() {
        System.out.println("ZIP compression");
    }
}
