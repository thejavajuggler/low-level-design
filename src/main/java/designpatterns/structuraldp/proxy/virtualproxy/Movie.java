package designpatterns.structuraldp.proxy.virtualproxy;

public class Movie implements Video{

    private final String title;

    public Movie(String title) throws InterruptedException {
        this.title = title;
        loadVideo();
    }

    private void loadVideo() throws InterruptedException {
        System.out.println("Loading video");
        Thread.sleep(4000);
    }

    @Override
    public void play() {
        System.out.println("Playing movie " + title);
    }
}
