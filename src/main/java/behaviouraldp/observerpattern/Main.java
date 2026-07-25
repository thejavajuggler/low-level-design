package behaviouraldp.observerpattern;

public class Main {

    public static void main(String[] args) {
        YouTubeSubscriber youTubeSubscriber1 = new YouTubeSubscriber("Reboni", 1);
        YouTubeSubscriber youTubeSubscriber2 = new YouTubeSubscriber("Shamma", 2);
        YouTubeSubscriber youTubeSubscriber3 = new YouTubeSubscriber("Felcy", 3);

        Channel channel = new Channel("Blessed Channel");
        channel.subscribe(youTubeSubscriber1);
        channel.subscribe(youTubeSubscriber2);
        channel.subscribe(youTubeSubscriber3);

        channel.addVideo("Observer Pattern");
    }
}
