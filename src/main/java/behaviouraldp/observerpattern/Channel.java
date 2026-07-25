package behaviouraldp.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private String name;

    public String getName() {
        return name;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    private String videoTitle;

    List<Subscriber> youTubeSubscriberList = new ArrayList<>();

    public Channel(String name) {
        this.name = name;
    }

    public void subscribe(Subscriber subscriber) {
        youTubeSubscriberList.add(subscriber);
        //System.out.println(subscriber.getName() + " has subscribed to your channel");
    }

    public void addVideo(String videoName) {
        this.videoTitle = videoName;
        for (Subscriber youTubeSubscriber : youTubeSubscriberList) {
            youTubeSubscriber.uploadedVideo(this);
        }
    }
}
