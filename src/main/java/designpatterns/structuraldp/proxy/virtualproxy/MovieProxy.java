package designpatterns.structuraldp.proxy.virtualproxy;

public class MovieProxy implements Video{

    private String title;

    private Video video;

    public MovieProxy(String title) {
        this.title = title;
        System.out.println("Creating movie Object for " + title);
    }

    @Override
    public void play() throws InterruptedException {
        if (video == null)
            new Movie(title);
        video.play();
    }
}
