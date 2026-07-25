package behaviouraldp.observerpattern;

public class YouTubeSubscriber implements Subscriber{

    private String name;

    public String getName() {
        return name;
    }

    private int id;

    public YouTubeSubscriber(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void uploadedVideo(Channel channel) {
        System.out.println("Dear " + name + " a new video " +  channel.getVideoTitle() + " has been added by " + channel.getName());
    }
}
