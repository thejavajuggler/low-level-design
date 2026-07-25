package behaviouraldp.srategypattern;

public class GZIPStrategy implements CompressionStrategy{
    @Override
    public void compress() {
        System.out.println("GZIP strategy");
    }
}
